package com.learning.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {
    public static void main(String[] args) {

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
        ApplicationContext appContext = new ClassPathXmlApplicationContext("beans.xml");

        Sim sim = appContext.getBean("sim", com.learning.springcore.Sim.class);

        sim.call();
        sim.internet();

        Battery battery = appContext.getBean("battery", com.learning.springcore.Battery.class);
        System.out.println("The battery capacity is " + battery.getCapacityInmah() + " mah");
        System.out.println("The battery warranty is " + battery.getWarrantyYears() + " years");
        System.out.println("The battery type is " + battery.getTypeOfBattery() + " years");
    }
}