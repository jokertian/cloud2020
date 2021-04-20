package org.example.controller;

import lombok.extern.slf4j.Slf4j;
import org.example.entities.CommonResult;
import org.example.model.Order;
import org.example.service.OrderService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Slf4j
public class OrderController {
    @Resource
    private OrderService orderService;

    @PostMapping(value = "/order/create")
    public CommonResult<String> create(@RequestBody Order order) {
        orderService.createOrder(order);
        return new CommonResult<>(200, "订单创建成功");
    }
}
