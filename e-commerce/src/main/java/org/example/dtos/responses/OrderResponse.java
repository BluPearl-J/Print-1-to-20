package org.example.dtos.responses;
import lombok.Data;
import java.util.List;
@Data
public class OrderResponse {
    private String id;
    private String userId;
    private List<String> productIds;
    private double total;
}
