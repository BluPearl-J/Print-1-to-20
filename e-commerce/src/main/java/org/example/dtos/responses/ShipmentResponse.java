package org.example.dtos.responses;
import lombok.Data;
@Data
public class ShipmentResponse {
    private String id;
    private String orderId;
  private String address;
   private String status;
}
