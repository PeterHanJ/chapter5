package com.smart;

public class Worker {
    private Car ownCar;
    private int age;
    private Office office;

    public Worker(Car ownCar,int age,Office office){
        this.ownCar = ownCar;
        this.age = age;
        this.office = office;
    }

    public Car getOwnCar() {
        return ownCar;
    }

    public void setOwnCar(Car ownCar) {
        this.ownCar = ownCar;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Office getOffice() {
        return office;
    }

    public void setOffice(Office office) {
        this.office = office;
    }
}
