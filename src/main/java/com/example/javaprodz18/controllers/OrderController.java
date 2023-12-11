package com.example.javaprodz18.controllers;

import com.example.javaprodz18.dto.OrderDto;
import com.example.javaprodz18.service.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(name = "/api/order")
public class OrderController {
    @Autowired
    OrderServiceImpl orderService;

    @GetMapping(name = "/{id}")
    public OrderDto getOrderById(@PathVariable(name = "id") int id){
        OrderDto orderDto = orderService.getOrderById(id);
        return orderDto;
    }
    @GetMapping()
    public List<OrderDto> getAllOrders(){
        List<OrderDto> allOrders = orderService.getAllOrders();
        return allOrders;
    }
    @PostMapping()
    public void saveOrder(@RequestBody OrderDto orderDto){
        orderService.saveOrder(orderDto);
    }
    @DeleteMapping (name = "/{id}")
    public void deleteOrder(@PathVariable(name = "id") int id){
        orderService.deleteOrder(id);
    }

    @PutMapping(name = "/{id}")
    public void updateOrder(@PathVariable(name = "id") int id, @RequestBody OrderDto orderDto){
        orderService.updateOrder(id,orderDto);
    }

}
