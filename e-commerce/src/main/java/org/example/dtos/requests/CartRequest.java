package org.example.dtos.requests;
import java.util.List;
import lombok.Data;
@Data

public  class CartRequest {
    private String userId;
    private java.util.List<String> productIds;  }