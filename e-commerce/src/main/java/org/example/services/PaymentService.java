package org.example.services;
import org.example.dtos.requests.PaymentRequest;
import org.example.dtos.responses.PaymentResponse;

import java.util.List;

public interface PaymentService {
    PaymentResponse createPayment(PaymentRequest request);
    PaymentResponse processPayment(PaymentRequest request);
    PaymentResponse getPaymentById(String paymentId);
    List<PaymentResponse> getAllPayments();
    PaymentResponse deletePayment(String paymentId);
}
