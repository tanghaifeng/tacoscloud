package com.tacoscloud.tacos;

import com.tacoscloud.tacos.annotation.Apple;
import com.tacoscloud.tacos.annotation.FruitInfoUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.tacoscloud"})
public class TacosCloudApplication {



    public static void main(String[] args) throws Exception {
        Apple a = FruitInfoUtil.getApple(Apple.class);
        System.out.println(a.getAppleProviderName());
        System.out.println(a.getAppleId());
        SpringApplication.run(TacosCloudApplication.class, args);
    }

}
