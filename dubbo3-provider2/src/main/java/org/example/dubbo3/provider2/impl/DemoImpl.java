package org.example.dubbo3.provider2.impl;

import org.apache.dubbo.config.annotation.DubboService;
import org.example.dubbo3.api.DemoService;

@DubboService()
public class DemoImpl implements DemoService {

    @Override
    public String sayHello(String name) {
        System.err.println("provider 2 received name: " + name);
        return "hello:" + name;
    }

    @Override
    public String greet(String name) {
        System.err.println("provider 2 greet name: " + name);
        return "greet:" + name;
    }
}
