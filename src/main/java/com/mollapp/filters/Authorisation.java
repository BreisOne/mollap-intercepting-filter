package com.mollapp.filters;

public class Authorisation implements Filter{

    public Authorisation() {
    }

    @Override
    public void execution(String name) {
        System.out.println("Autorización OK para " + name);
    }
}
