package com.tacoscloud.tacos.base;

public class IntegerDemo {
    public static void main(String[] args) {
        // IntegerCache
        Integer s = 1;
        Integer s1 = 1;;
        System.out.println(s == s1);

        Integer s2 = 128;
        Integer s3 = 128;
        System.out.println(s2 == s3);
    }
}
