package com.smart.factory;

import com.smart.Car;
import org.springframework.beans.factory.FactoryBean;

public class CarFactoryBean implements FactoryBean<Car> {
    private String carInfo;

    public String getCarInfo() {
        return carInfo;
    }
    //receive car info
    public void setCarInfo(String carInfo) {
        this.carInfo = carInfo;
    }

    public Car getObject() throws Exception {
        Car car = new Car();
        String[] infos = carInfo.split(",");
        car.setBrand(infos[0]);
        car.setColor(infos[1]);
        car.setMaxSpeed(Integer.parseInt(infos[2]));

        return car;
    }

    public Class<Car> getObjectType() {
        return Car.class;
    }

    public boolean isSingleton() {
        return false;
    }
}

