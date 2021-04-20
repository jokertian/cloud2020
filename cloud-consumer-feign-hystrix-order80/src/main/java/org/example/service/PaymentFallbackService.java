package org.example.service;

import org.springframework.stereotype.Component;

@Component
public class PaymentFallbackService implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "------------- PaymentFallbackService fall paymentInfoOk o(╥﹏╥)o";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "------------- PaymentFallbackService fall paymentInfoTimeout o(╥﹏╥)o";
    }
}
