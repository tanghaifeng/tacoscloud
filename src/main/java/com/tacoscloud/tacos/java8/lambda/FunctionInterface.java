package com.tacoscloud.tacos.java8.lambda;

public class FunctionInterface {
    public static void main(String[] args) {
        FunctionInterfaceDemo d = ()->{
            System.out.println("自定义函数接口");
        };
        d.getName();

    }
}
