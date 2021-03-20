package com.tacoscloud.tacos.annotation;

public class FruitInfoUtil {
    public static Apple getApple(Class<?> clazz) throws Exception {
        FruitProvider p = clazz.getAnnotation(FruitProvider.class);
        Apple a = (Apple)clazz.newInstance();
        a.setAppleId(p.id());
        a.setAppleProviderAddress(p.address());
        a.setAppleProviderName(p.name());
        return a;
    }
}
