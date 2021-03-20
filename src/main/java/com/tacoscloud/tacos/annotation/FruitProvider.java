package com.tacoscloud.tacos.annotation;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FruitProvider {

     int id() default -1;
     String name() default "";
     String address() default "";
}
