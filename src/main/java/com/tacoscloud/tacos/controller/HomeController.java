package com.tacoscloud.tacos.controller;

import com.tacoscloud.tacos.entity.Taco;
import com.tacoscloud.tacos.service.Member;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
@DependsOn("springUtils")
@Controller
public class HomeController {
    @Resource
    Member member;

    @GetMapping("/home")
    @ResponseBody
    public String home() {
        member.getInfo();

        Taco taco = new Taco();
        return taco.getTacoName();
    }
}
