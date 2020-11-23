package ru.test;

import com.dataaccess.webservicesserver.NumberConversion;
import com.dataaccess.webservicesserver.NumberConversionSoapType;

import java.math.BigDecimal;


public class TestBean {
    public TestBean() {
    }

    public String test() {
        NumberConversion numberConversion = new NumberConversion();
        final NumberConversionSoapType numberConversionSoap = numberConversion.getNumberConversionSoap();
        return numberConversionSoap.numberToDollars(BigDecimal.valueOf(333));
    }
}
