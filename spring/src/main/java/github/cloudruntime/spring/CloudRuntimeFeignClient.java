package github.cloudruntime.spring;

import feign.Client;
import feign.Request;
import feign.Request.Options;
import feign.Response;
import java.io.IOException;

public class CloudRuntimeFeignClient implements Client {

    @Override
    public Response execute(Request request, Options options) throws IOException {
        return null;
    }
}
