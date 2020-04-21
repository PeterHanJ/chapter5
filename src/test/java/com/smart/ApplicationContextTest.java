package com.smart;

import com.smart.factory.CarFactoryBean;
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
        //ar newCar = context.getBean("NewCar",Car.class);
        //newCar.introduce();

        //method replace
        //Car car1 = context.getBean("Car1",Car.class);
        //car1.printCar("Car");

        //bean inherited
        //Car abstractCar = context.getBean("abstractCar",Car.class);
        //Car car3 = context.getBean("car3",Car.class);
        //Car car4 = context.getBean("car4",Car.class);
        //car3.introduce();
        //car4.introduce();

        //Worker worker1 = context.getBean("worker1",Worker.class);
        //System.out.println("worker1 --> carId : " + worker1.getCarId());


        //FactoryBean to create bean
        Car beanCar = context.getBean("beanCar",Car.class);
        beanCar.introduce();

        //Get CarFactoryBean, need add '&' in front of beanName
        CarFactoryBean carFactoryBean = context.getBean("&beanCar",CarFactoryBean.class);
        System.out.println("carFactoryBean car info-->" + carFactoryBean.getCarInfo());

    }
}

