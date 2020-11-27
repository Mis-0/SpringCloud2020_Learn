package com.asir.payment.service.impl;

import com.asir.commons.entities.Payment;
import com.asir.payment.mapper.PaymentMapper;
import com.asir.payment.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author asir
 * @date 2020/11/22 - 21:46
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    PaymentMapper paymentMapper;

    public int addPayment(Payment payment){
        int insert = paymentMapper.insert(payment);
        return insert;
    }

    @Override
    public Payment queryPaymentById(int id) {
        return paymentMapper.selectById(id);
    }
}
