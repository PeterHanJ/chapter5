package com.smart;

public class ClassA {
    private String name;
    private ClassB b;

    public ClassA(String name,ClassB b){
        this.name = name;
        this.b = b;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ClassB getB() {
        return b;
    }

    public void setB(ClassB b) {
        this.b = b;
    }
}
