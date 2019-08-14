package com.huawei.servicecomb.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestProjecttemplate3 {

    Projecttemplate3Delegate projecttemplate3Delegate = new Projecttemplate3Delegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = projecttemplate3Delegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}
