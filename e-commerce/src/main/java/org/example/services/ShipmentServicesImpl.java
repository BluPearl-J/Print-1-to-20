package org.example.services;

import org.example.data.models.Shipment;
import org.example.data.repositories.ShipmentRepository;
import org.example.dtos.requests.ShipmentRequest;
import org.example.dtos.responses.ShipmentResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ShipmentServicesImpl implements ShipmentService {

    @Autowired
    private ShipmentRepository shipmentRepository;

    @Override
    public ShipmentResponse createShipment(ShipmentRequest request) {
        Shipment shipment = new Shipment();
        shipment.setOrderId(request.getOrderId());
        shipment.setAddress(request.getAddress());
        shipment.setStatus(request.getStatus());

        Shipment saved = shipmentRepository.save(shipment);
        return toResponse(saved);
    }

    @Override
    public ShipmentResponse getShipmentById(String shipmentId) {
        Optional<Shipment> shipmentOpt = shipmentRepository.findById(shipmentId);
        return shipmentOpt.map(this::toResponse).orElse(null);
    }

    @Override
    public List<ShipmentResponse> getAllShipments() {
        List<Shipment> shipments = shipmentRepository.findAll();
        List<ShipmentResponse> responses = new ArrayList<>();
        for (Shipment s : shipments) {
            responses.add(toResponse(s));
        }
        return responses;
    }

    @Override
    public ShipmentResponse deleteShipment(String shipmentId) {
        Optional<Shipment> shipmentOpt = shipmentRepository.findById(shipmentId);
        if (shipmentOpt.isPresent()) {
            Shipment shipment = shipmentOpt.get();
            shipmentRepository.delete(shipment);
            return toResponse(shipment);
        }
        return null;
    }

    private ShipmentResponse toResponse(Shipment shipment) {
        ShipmentResponse response = new ShipmentResponse();
        response.setId(shipment.getId());
        response.setOrderId(shipment.getOrderId());
        response.setAddress(shipment.getAddress());
        response.setStatus(shipment.getStatus());
        return response;
    }
}
