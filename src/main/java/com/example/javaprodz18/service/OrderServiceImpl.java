package com.example.javaprodz18.service;

import com.example.javaprodz18.dto.OrderDto;
import com.example.javaprodz18.repository.jdbc.OrderJDBCRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    OrderJDBCRepository orderJDBCRepository;

    @Override
    public List<OrderDto> getAllOrders() {
        return orderJDBCRepository.getAllOrders();
    }

    @Override
    public OrderDto getOrderById(int id) {
        return orderJDBCRepository.getOrderById(id);
    }

    @Override
    public void saveOrder(OrderDto orderDto) {
        orderJDBCRepository.saveOrder(orderDto);
    }

    @Override
    public void updateOrder(int id, OrderDto newOrder) {
                orderJDBCRepository.updateOrder(id,newOrder);
    }

    @Override
    public void deleteOrder(int id) {
        orderJDBCRepository.deleteOrder(id);
    }
}
