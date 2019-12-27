package com.funtl.hello.spring.cloud.alibaba.nacos.consumer.feign.service;

import org.springframework.stereotype.Component;

@Component
public class EchoServiceImpl implements EchoService {
    @Override
    public String echo(String message) {
        return  "echo fallback";
    }
}
