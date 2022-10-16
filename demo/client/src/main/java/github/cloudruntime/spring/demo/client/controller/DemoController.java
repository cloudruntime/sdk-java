package github.cloudruntime.spring.demo.client.controller;

import github.cloudruntime.spring.demo.client.feign.DemoClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Autowired
    private DemoClient demoClient;

    @RequestMapping("/test")
    public String test() {
        return demoClient.test();
    }
}
