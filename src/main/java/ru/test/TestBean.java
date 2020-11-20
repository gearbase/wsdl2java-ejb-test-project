package ru.test;

import jakarta.ejb.Stateless;

@Stateless(name = "TestEJB")
public class TestBean {
    public TestBean() {
    }

    public String test() {
        return "WWWWWWWWWWWWWWWWWWWWWWWWWWW";
    }
}
