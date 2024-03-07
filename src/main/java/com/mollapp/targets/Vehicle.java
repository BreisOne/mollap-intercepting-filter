package com.mollapp.targets;

public class Vehicle implements Target{
    public Vehicle(){

    }
    @Override
    public void execution(String name) {
        System.out.println("Puerta abierta "+name+"!");
    }
}
