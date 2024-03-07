package com.mollapp.filters;

public class Authentication implements Filter{

    public Authentication(){
    };
    public void execution(String name){
        System.out.println("Autenticación OK para " + name);
    }
}
