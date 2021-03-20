package com.tacoscloud.tacos.service;

import org.springframework.stereotype.Service;

@Service
public class MemberImpl implements Member {

    @Override
    public void getInfo() {
            System.out.println("111");
    }
}
