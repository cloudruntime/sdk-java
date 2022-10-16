package github.cloudruntime.spring.demo.client.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(value = "demo-server", contextId = "demo")
public interface DemoClient {

    @PostMapping("/test")
    String test();
}
