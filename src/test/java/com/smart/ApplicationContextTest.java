package com.smart;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:smart-context.xml");

        //property injection
        //Car myCar = context.getBean("MyCar",Car.class);
        //myCar.introduce();

        //constructor injection
        //Worker worker = context.getBean("MyWorker",Worker.class);
        //System.out.println("worker's car -->" + worker.getOwnCar().getBrand());
        //System.out.println("worker's age -->" + worker.getAge());
        //System.out.println("worker's office-->" + worker.getOffice().getAddress());

        //factory injection
        Car newCar = context.getBean("NewCar",Car.class);
        newCar.introduce();

    }
}

