package com.liqisheng.springcloud.controller;

import com.liqisheng.springcloud.domain.CommonResult;
import com.liqisheng.springcloud.domain.Order;
import com.liqisheng.springcloud.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class OrderController {

    @Resource
    private OrderService orderService;

    @GetMapping("/order/create")
    public CommonResult create(Order order) {
        orderService.create(order);
        System.out.println(3333);
        return new CommonResult(200, "创建成功");
    }
}
