package ru.test;

import com.dataaccess.webservicesserver.NumberConversion;
import com.dataaccess.webservicesserver.NumberConversionSoapType;
import jakarta.ejb.Stateless;

import java.math.BigDecimal;

@Stateless(name = "TestEJB")
public class TestBean {
    public TestBean() {
    }

    public String test() {
        NumberConversion numberConversion = new NumberConversion();
        final NumberConversionSoapType numberConversionSoap = numberConversion.getNumberConversionSoap();
        return numberConversionSoap.numberToDollars(BigDecimal.valueOf(333));
    }
}
