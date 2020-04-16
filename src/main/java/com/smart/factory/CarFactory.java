package com.smart.factory;

import com.smart.Car;

public class CarFactory {
    public static Car createCar(String brand,String color){
        Car car = new Car();
        car.setBrand(brand);
        car.setColor(color);
        return car;
    }
}
