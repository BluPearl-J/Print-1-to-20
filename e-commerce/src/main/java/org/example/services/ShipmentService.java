package org.example.services;

import org.example.dtos.requests.ShipmentRequest;
import org.example.dtos.responses.ShipmentResponse;

import java.util.List;

public interface ShipmentService {
    ShipmentResponse createShipment(ShipmentRequest request);
    ShipmentResponse getShipmentById(String shipmentId);
    List<ShipmentResponse> getAllShipments();
    ShipmentResponse deleteShipment(String shipmentId);
}
