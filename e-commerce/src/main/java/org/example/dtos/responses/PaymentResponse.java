package org.example.dtos.responses;
import lombok.Data;
@Data
public class PaymentResponse {
    private String id;
    private String orderId;
    private String method;
    private double amount;
    private boolean success;
}
