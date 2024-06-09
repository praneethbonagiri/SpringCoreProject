package com.learning.springcore;

public class Mobile {


        /*
        This is how we normally write java code
        Where ever we need some class we create object of that class
        and use it.

        The problem with this approach is if I need to change the sim,
        I need to change the source code

        This indicates our application is not configurable
         */
//        Sim sim = new Airtel();
//
//        sim.call();
//        sim.internet();

        /*
        Now let us use spring framework in our application
        Spring makes our application more configurable, and it manages all the
        beans/objects needed for our application.

        Instead of us creating the objects we can instruct spring to create
        and provide us.
         */


       Sim sim;
       Battery battery;
       String mobileCompany;

    public void setSim(Sim sim) {
        this.sim = sim;
    }

    public void setBattery(Battery battery) {
        this.battery = battery;
    }

    public void setMobileCompany(String mobileCompany) {
        this.mobileCompany = mobileCompany;
    }

    public void call(){
        sim.call();
    }

    public void batteryDetails(){
        battery.getDetails();
    }
}