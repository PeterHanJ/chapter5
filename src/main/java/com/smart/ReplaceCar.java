package com.smart;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

public class ReplaceCar implements MethodReplacer
{

    public Object reimplement(Object o, Method method, Object[] objects) throws Throwable {
        System.out.println("Goodbye :" + objects[0]);
        return null;
    }
}
