package org.example.service;

import org.example.entities.CommonResult;
import org.example.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "nacos-payment-provider", fallback = ConsumerServiceImpl.class)
public interface ConsumerService {

    @GetMapping(value = "/paymentSQL/{id}")
    CommonResult<Payment> getPayment(@PathVariable("id") Long id);
}
