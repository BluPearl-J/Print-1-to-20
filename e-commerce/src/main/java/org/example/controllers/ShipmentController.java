package org.example.controllers;
import org.example.dtos.requests.ShipmentRequest;
import org.example.dtos.responses.ShipmentResponse;
import org.example.services.ShipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/shipments")
public class ShipmentController {
    @Autowired
    private ShipmentService shipmentService;

    @PostMapping("/create")
    public ShipmentResponse createShipment(@RequestBody ShipmentRequest request) {
        return shipmentService.createShipment(request);
    }

    @GetMapping("/{id}")
    public ShipmentResponse getShipment(@PathVariable String id) {
        return shipmentService.getShipmentById(id);
    }
}
