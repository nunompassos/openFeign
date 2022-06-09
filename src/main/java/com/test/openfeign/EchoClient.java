package com.test.openfeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.test.openfeign.model.EchoResponse;

@FeignClient(value = "postman-echo", url = "https://postman-echo.com")
public interface EchoClient {

    @GetMapping(path = "/get")
    EchoResponse getEcho(
        @RequestParam("param1") String param1,
        @RequestParam("param2") String param2
    );

    @PostMapping(path = "/post")
    EchoResponse postEcho(
        @RequestBody EchoResponse echoResponse
    );

}
