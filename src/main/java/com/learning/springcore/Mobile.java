package com.learning.springcore;

public class Mobile {
    public static void main(String[] args) {

        Sim sim = new Jio();

        sim.call();
        sim.internet();
    }
}