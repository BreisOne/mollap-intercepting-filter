package com.mollapp.filters;

public class Authentication implements Filter{

    public Authentication(){
    };
    public void execution(String user){
        System.out.println("Autenticación OK para " + user);
    }
}
