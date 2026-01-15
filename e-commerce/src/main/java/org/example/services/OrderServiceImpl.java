package org.example.services;

import org.example.data.models.Order;
import org.example.data.repositories.OrderRepository;
import org.example.dtos.requests.OrderRequest;
import org.example.dtos.responses.OrderResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public OrderResponse createOrder(OrderRequest request) {
        Order order = new Order();
        order.setUserId(request.getUserId());
        order.setProductIds(request.getProductIds());
        order.setTotal(request.getTotal());

        Order saved = orderRepository.save(order);
        return toResponse(saved);
    }

    @Override
    public OrderResponse getOrderById(String orderId) {
        Optional<Order> orderOpt = orderRepository.findById(orderId);
        return orderOpt.map(this::toResponse).orElse(null);
    }

    @Override
    public List<OrderResponse> getAllOrders() {
        List<Order> orders = orderRepository.findAll();
        List<OrderResponse> responses = new ArrayList<>();
        for (Order o : orders) {
            responses.add(toResponse(o));
        }
        return responses;
    }

    @Override
    public OrderResponse deleteOrder(String orderId) {
        Optional<Order> orderOpt = orderRepository.findById(orderId);
        if (orderOpt.isPresent()) {
            Order order = orderOpt.get();
            orderRepository.delete(order);
            return toResponse(order);
        }
        return null;
    }

    private OrderResponse toResponse(Order order) {
        OrderResponse response = new OrderResponse();
        response.setId(order.getId());
        response.setUserId(order.getUserId());
        response.setProductIds(order.getProductIds());
        response.setTotal(order.getTotal());
        return response;
    }
}
