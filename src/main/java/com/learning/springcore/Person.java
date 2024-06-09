package com.learning.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Person {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Mobile mobile = context.getBean("mobile", Mobile.class);

        mobile.call();

        mobile.batteryDetails();
}
}