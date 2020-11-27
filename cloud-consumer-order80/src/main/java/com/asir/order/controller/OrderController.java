package com.asir.order.controller;

import com.asir.commons.entities.Payment;
import com.asir.commons.entities.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author asir
 * @date 2020/11/26 - 9:23
 */
@RestController
@RequestMapping("/api/consumer/payment")
@Slf4j
public class OrderController {
//    private final String PAYMENT_URL= "http://localhost:8001/api/payment";
    private final String PAYMENT_SERVICE_URL="http://CLOUD-PAYMENT-SERVCIE";

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("create")
    public Result createOrder(Payment payment){
        return restTemplate.postForObject(PAYMENT_SERVICE_URL+"/add",payment,Result.class);
    }

    @RequestMapping("find/{id}")
    public Result queryPaymentById(@PathVariable(name = "id") int id){
        return restTemplate.getForObject(PAYMENT_SERVICE_URL+"/api/payment/find/"+id,Result.class);
    }
}
