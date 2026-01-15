package org.example.services;

import org.example.dtos.requests.OrderRequest;
import org.example.dtos.responses.OrderResponse;

import java.util.List;

public interface OrderService {
    OrderResponse createOrder(OrderRequest request);
    OrderResponse getOrderById(String orderId);
    List<OrderResponse> getAllOrders();
    OrderResponse deleteOrder(String orderId);
}
