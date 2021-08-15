package com.liqisheng.springcloud.controller;

import com.liqisheng.springcloud.service.PaymentBreakService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Slf4j
public class PaymentBreakController {

    @Resource
    private PaymentBreakService paymentBreakService;

    //====服务熔断
    @GetMapping("/payment/circuit/{id}")
    public String paymentCircuitBreaker(@PathVariable("id") Integer id)
    {
        String result = paymentBreakService.paymentCircuitBreaker(id);
        log.info("****result: "+result);
        return result;
    }
}
