package com.mollapp.filters;

public class Authorisation implements Filter{

    public Authorisation() {
    }

    @Override
    public void execution(String user) {
        System.out.println("Autorización OK para " + user);
    }
}
