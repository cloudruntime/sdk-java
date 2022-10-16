package github.cloudruntime.spring.demo.server.cotroller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @PostMapping("/test")
    public String test() {
        return "hello word!";
    }
}
