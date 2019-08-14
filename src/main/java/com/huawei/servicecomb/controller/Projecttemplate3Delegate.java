package com.huawei.servicecomb.controller;

import org.springframework.stereotype.Component;


@Component
public class Projecttemplate3Delegate implements Projecttemplate3 {

    public String helloworld(String name){

        // Do Some Magic Here!
        return name;
    }
}
