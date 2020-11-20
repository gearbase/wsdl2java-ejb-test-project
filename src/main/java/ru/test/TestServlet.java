package ru.test;


import jakarta.ejb.EJB;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class TestServlet extends HttpServlet {
    @EJB
    TestBean bean;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        final String number = request.getParameter("number");
        final PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.write("<h1>" + bean.test() + "</h1>" );
        writer.println("</html>");

    }

}
