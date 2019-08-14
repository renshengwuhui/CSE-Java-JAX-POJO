package com.huawei.servicecomb.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.apache.servicecomb.provider.pojo.RpcSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CsePojoDemoCodegen", date = "2019-08-14T08:32:52.779Z")

@RpcSchema(schemaId = "projecttemplate3")
public class Projecttemplate3Impl implements Projecttemplate3{

    @Autowired
    private Projecttemplate3Delegate projecttemplate3Delegate;


    public String helloworld(String name) {

        return projecttemplate3Delegate.helloworld(name);
    }

}
