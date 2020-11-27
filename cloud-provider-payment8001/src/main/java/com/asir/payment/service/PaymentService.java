package com.asir.payment.service;

import com.asir.commons.entities.Payment;

/**
 * @author asir
 * @date 2020/11/22 - 21:45
 */
public interface PaymentService {
    Payment queryPaymentById(int id);
}
