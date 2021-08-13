package com.liqisheng.cloud.service;

import com.liqisheng.cloud.entity.Payment;

public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(Long id);

}
