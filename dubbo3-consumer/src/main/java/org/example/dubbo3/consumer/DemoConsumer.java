package org.example.dubbo3.consumer;

import org.apache.dubbo.config.annotation.DubboReference;
import org.example.dubbo3.api.DemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoConsumer {
    @DubboReference( timeout = 1000, retries = 0)
    private DemoService demoService;

    @GetMapping("/fun-test")
    public String funTest(String name) {
        return demoService.sayHello(name);
    }

    @GetMapping("/greet-test")
    public String greetTest(String name) {
        return demoService.greet(name);
    }

}
