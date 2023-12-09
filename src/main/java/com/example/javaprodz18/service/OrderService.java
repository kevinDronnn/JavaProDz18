package com.example.javaprodz18.service;

import com.example.javaprodz18.dto.OrderDto;

import java.util.List;

public interface OrderService {
    public List<OrderDto> getAllOrders();
    public OrderDto getOrderById(int id);
    public void addOrder(OrderDto orderDto);
    public void updateOrder(int id, OrderDto newOrder);
    public void deleteOrder(int id);
}
