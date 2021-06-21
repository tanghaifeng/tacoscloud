package com.tacoscloud.tacos.invoke;

import com.tacoscloud.tacos.base.IntegerDemo;
import com.tacoscloud.tacos.thread.ThreadPoolManager;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectDemo {

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        invokeStatic("run", IntegerDemo.class);
    }

    public Method[] getMethods(Class clazz) {
        return clazz.getMethods();
    }

    public static void invokeStatic(String methodName, Class clazz) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
       Method m = clazz.getMethod(methodName);
       m.invoke(clazz);
    }
}
