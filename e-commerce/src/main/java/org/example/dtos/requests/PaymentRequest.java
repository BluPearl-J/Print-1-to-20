package org.example.dtos.requests;
import lombok.Data;


@Data
public class PaymentRequest {
    private String orderId;
    private String method;
    private double amount;
    private boolean success;  }