package org.example.service;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl {

    @SentinelResource("doSomething")
    public void doSomething() {
        System.out.println("doSomething");
    }

}
