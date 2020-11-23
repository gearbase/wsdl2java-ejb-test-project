package ru.test;


import jakarta.ejb.EJB;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.io.IOException;
import java.io.PrintWriter;

public class TestServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        final String number = request.getParameter("number");
        final PrintWriter writer = response.getWriter();
        try {
            InitialContext context = new InitialContext();
            TestBean bean = (TestBean) context.lookup("java:app/TestBean");
            writer.println("<html>");
            writer.write("<h1>" + bean.test() + "</h1>" );
            writer.println("</html>");
        } catch (NamingException e) {
            e.printStackTrace();
        }



    }

}
