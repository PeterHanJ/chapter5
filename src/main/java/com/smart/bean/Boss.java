package com.smart.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Boss {
    private String name;
    private Employee employee;

    public Boss(){
        System.out.println("Execute in constructor");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee getEmployee() {
        return employee;
    }

    @Autowired
    public void setEmployee(Employee employee) {
        System.out.println("execute in employee");
        this.employee = employee;
    }

    @PostConstruct
    public void init1(){
        System.out.println("init1");
    }
    @PostConstruct
    public void init2(){
        System.out.println("init2");
    }

    @PreDestroy
    public void destroy1(){
        System.out.println("destroy1");
    }

    @PreDestroy
    public void destroy2(){
        System.out.println("destroy2");
    }

}
