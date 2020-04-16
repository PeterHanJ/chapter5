package com.smart;

public class ClassB {
    private String name;
    private ClassA classA;

    public ClassB(String name,ClassA a){
        this.name = name;
        this.classA = a;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ClassA getClassA() {
        return classA;
    }

    public void setClassA(ClassA classA) {
        this.classA = classA;
    }
}
