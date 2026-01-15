package org.example.controllers;
import org.example.dtos.requests.PaymentRequest;
import org.example.dtos.responses.PaymentResponse;
import org.example.services.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payments")
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @PostMapping("/process")
    public PaymentResponse processPayment(@RequestBody PaymentRequest request) {
        return paymentService.processPayment(request);
    }

    @GetMapping("/{id}")
    public PaymentResponse getPayment(@PathVariable String id) {
        return paymentService.getPaymentById(id);
    }
}
