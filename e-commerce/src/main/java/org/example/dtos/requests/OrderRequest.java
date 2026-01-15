package org.example.dtos.requests;
import lombok.Data;
@Data
public class OrderRequest {
    private String userId;
    private java.util.List<String> productIds;
    private double total;
}