package org.example.dubbo3.provider.impl;

import org.apache.dubbo.config.annotation.DubboService;
import org.example.dubbo3.api.DemoService;

@DubboService()
public class DemoImpl implements DemoService {

    @Override
    public String sayHello(String name) {
        System.err.println("provider received name: " + name);
        return "hello:" + name;
    }

    @Override
    public String greet(String name) {
        return "";
    }
}
