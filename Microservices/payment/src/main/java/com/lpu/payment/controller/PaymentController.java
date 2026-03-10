package com.lpu.payment.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.lpu.payment.entity.Payment;
import com.lpu.payment.service.PaymentService;


@RestController
@RequestMapping("/payments")
public class PaymentController {

    @Autowired
    private PaymentService service;

    @PostMapping("/create")
    public Payment createPayment(@RequestBody Payment payment) {
        return service.savePayment(payment);
    }

    @GetMapping("/all")
    public List<Payment> getAllPayments() {
        return service.getAllPayments();
    }

    @GetMapping("/get/{id}")
    public Payment getPayment(@PathVariable int id) {
        return service.getPaymentById(id);
    }

    @DeleteMapping("/delete/{id}")
    public String deletePayment(@PathVariable int id) {
        service.deletePayment(id);
        return "Payment Deleted";
    }
}