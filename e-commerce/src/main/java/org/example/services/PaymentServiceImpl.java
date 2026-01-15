package org.example.services;

import org.example.data.models.Payment;
import org.example.data.repositories.PaymentRepository;
import org.example.dtos.requests.PaymentRequest;
import org.example.dtos.responses.PaymentResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    @Override
    public PaymentResponse createPayment(PaymentRequest request) {
        Payment payment = new Payment();
        payment.setOrderId(request.getOrderId());
        payment.setMethod(request.getMethod());
        payment.setAmount(request.getAmount());
        payment.setSuccess(request.isSuccess());

        Payment saved = paymentRepository.save(payment);
        return toResponse(saved);
    }

    @Override
    public PaymentResponse getPaymentById(String paymentId) {
        Optional<Payment> paymentOpt = paymentRepository.findById(paymentId);
        return paymentOpt.map(this::toResponse).orElse(null);
    }

    @Override
    public List<PaymentResponse> getAllPayments() {
        List<Payment> payments = paymentRepository.findAll();
        List<PaymentResponse> responses = new ArrayList<>();
        for (Payment p : payments) {
            responses.add(toResponse(p));
        }
        return responses;
    }
    @Override
    public PaymentResponse processPayment(PaymentRequest request) {
        // Example logic: mark payment as processed
        Payment payment = new Payment();
        payment.setOrderId(request.getOrderId());
        payment.setMethod(request.getMethod());
        payment.setAmount(request.getAmount());
        payment.setSuccess(true); // assume processing succeeds

        Payment saved = paymentRepository.save(payment);
        return toResponse(saved);
    }


    @Override
    public PaymentResponse deletePayment(String paymentId) {
        Optional<Payment> paymentOpt = paymentRepository.findById(paymentId);
        if (paymentOpt.isPresent()) {
            Payment payment = paymentOpt.get();
            paymentRepository.delete(payment);
            return toResponse(payment);
        }
        return null;
    }

    private PaymentResponse toResponse(Payment payment) {
        PaymentResponse response = new PaymentResponse();
        response.setId(payment.getId());
        response.setOrderId(payment.getOrderId());
        response.setMethod(payment.getMethod());
        response.setAmount(payment.getAmount());
        response.setSuccess(payment.isSuccess());
        return response;
    }
}
