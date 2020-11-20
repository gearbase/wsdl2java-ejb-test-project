package com.dataaccess.webservicesserver;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.4.1
 * 2020-11-20T13:26:49.975+03:00
 * Generated source version: 3.4.1
 *
 */
@WebService(targetNamespace = "http://www.dataaccess.com/webservicesserver/", name = "NumberConversionSoapType")
@XmlSeeAlso({ObjectFactory.class})
public interface NumberConversionSoapType {

    /**
     * Returns the word corresponding to the positive number passed as parameter. Limited to quadrillions.
     */
    @WebMethod(operationName = "NumberToWords")
    @RequestWrapper(localName = "NumberToWords", targetNamespace = "http://www.dataaccess.com/webservicesserver/", className = "com.dataaccess.webservicesserver.NumberToWords")
    @ResponseWrapper(localName = "NumberToWordsResponse", targetNamespace = "http://www.dataaccess.com/webservicesserver/", className = "com.dataaccess.webservicesserver.NumberToWordsResponse")
    @WebResult(name = "NumberToWordsResult", targetNamespace = "http://www.dataaccess.com/webservicesserver/")
    public java.lang.String numberToWords(

        @WebParam(name = "ubiNum", targetNamespace = "http://www.dataaccess.com/webservicesserver/")
        java.math.BigInteger ubiNum
    );

    /**
     * Returns the non-zero dollar amount of the passed number.
     */
    @WebMethod(operationName = "NumberToDollars")
    @RequestWrapper(localName = "NumberToDollars", targetNamespace = "http://www.dataaccess.com/webservicesserver/", className = "com.dataaccess.webservicesserver.NumberToDollars")
    @ResponseWrapper(localName = "NumberToDollarsResponse", targetNamespace = "http://www.dataaccess.com/webservicesserver/", className = "com.dataaccess.webservicesserver.NumberToDollarsResponse")
    @WebResult(name = "NumberToDollarsResult", targetNamespace = "http://www.dataaccess.com/webservicesserver/")
    public java.lang.String numberToDollars(

        @WebParam(name = "dNum", targetNamespace = "http://www.dataaccess.com/webservicesserver/")
        java.math.BigDecimal dNum
    );
}
