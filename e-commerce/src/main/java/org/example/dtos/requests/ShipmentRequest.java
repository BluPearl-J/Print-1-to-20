package org.example.dtos.requests;
import lombok.Data;
@Data
public class ShipmentRequest {
    private String orderId;
    private String address;
    private String status; }