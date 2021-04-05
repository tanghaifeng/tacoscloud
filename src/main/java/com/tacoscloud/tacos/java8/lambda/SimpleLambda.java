package com.tacoscloud.tacos.java8.lambda;

public class SimpleLambda {

    // Lambda 可以消除很多的样板代码
    public static void main(String[] args) {

       Runnable a = ()->System.out.println("1111");

       Thread thread = new Thread(a);

       thread.start();


       Thread thread1 = new Thread(()->{
           System.out.println("222");
       });
       thread1.start();

        Thread thread2 = new Thread(()->System.out.println("333"));
        thread2.start();

    }
}
