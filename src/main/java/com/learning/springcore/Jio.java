package com.learning.springcore;

public class Jio implements Sim{

    @Override
    public void call() {
        System.out.println("calling from jio sim");
    }

    @Override
    public void internet() {
        System.out.println("using internet from jio sim");
    }
}
