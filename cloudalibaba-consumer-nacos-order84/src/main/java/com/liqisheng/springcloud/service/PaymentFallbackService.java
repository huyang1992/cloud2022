package com.liqisheng.springcloud.service;

import com.liqisheng.cloud.entity.CommonResult;
import com.liqisheng.cloud.entity.Payment;
import org.springframework.stereotype.Component;

@Component
public class PaymentFallbackService  implements PaymentService{

    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<>(44444,"服务降级返回,---PaymentFallbackService",new Payment(id,"errorSerial"));
    }

}
