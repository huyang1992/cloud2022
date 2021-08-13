package com.liqisheng.cloud.service.impl;

import com.liqisheng.cloud.dao.PaymentDao;
import com.liqisheng.cloud.entity.Payment;
import com.liqisheng.cloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment)
    {
        System.out.println(1111111);
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id)
    {
        System.out.println(222222);
        return paymentDao.getPaymentById(id);
    }
}
