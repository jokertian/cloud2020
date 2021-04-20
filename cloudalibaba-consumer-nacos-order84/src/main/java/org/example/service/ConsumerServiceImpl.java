package org.example.service;

import org.example.entities.CommonResult;
import org.example.entities.Payment;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class ConsumerServiceImpl implements ConsumerService {
    @Override
    public CommonResult<Payment> getPayment(Long id) {
        return new CommonResult<>(444, "服务降级返回，------------PaymentFallbackService", new Payment(id, "errorSerial"));
    }
}
