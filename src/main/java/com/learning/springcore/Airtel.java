package com.learning.springcore;

public class Airtel implements Sim{

    @Override
    public void call() {
        System.out.println("calling from airtel sim");
    }

    @Override
    public void internet() {
        System.out.println("using internet from airtel sim");
    }
}
