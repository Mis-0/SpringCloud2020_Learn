package com.asir.payment.controller;

import com.asir.commons.entities.Payment;
import com.asir.commons.entities.Result;
import com.asir.payment.service.impl.PaymentServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * @author asir
 * @date 2020/11/22 - 21:46
 */
@RequestMapping("/api/payment")
@RestController
@Slf4j
public class PaymentController {

    @Autowired
    PaymentServiceImpl paymentService;

    @Value("${server.port}")
    private  String serverPort;

    @PostMapping("add")
    public Result addPayment(@RequestBody Payment payment){
        int i = paymentService.addPayment(payment);

        if (i> 0){
            return  Result.Ok();
        }else {
            return  Result.Error();
        }
    }

    @GetMapping("find/{id}")
    public Result getPayment(@PathVariable(name = "id") int id){
        Payment payment= paymentService.queryPaymentById(id);
        if (payment !=null){
            return  Result.Ok().data("item",payment).data("port:",serverPort);
        }
        return Result.Error();
    }
}
