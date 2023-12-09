package com.example.javaprodz18.repository.jdbc;

import com.example.javaprodz18.dto.OrderDto;
import com.example.javaprodz18.repository.mappers.OrderRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class OrderJDBCRepository {
    private final String SELECT_ORDER_BY_ID="SELECT * FROM order where id=";
    private final String DELETE_ORDER_BY_ID="DELETE FROM order where id=";
    private final String SELECT_ALL_ORDER="SELECT * FROM order";
    private final String SAVE_NEW_ORDER="INSERT INTO order VALUES(?,?,?,?)";
    private final JdbcTemplate jdbcTemplate;

    public OrderJDBCRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    public OrderDto getOrderById(int id){
        OrderDto orderDto = jdbcTemplate.queryForObject(SELECT_ORDER_BY_ID+id,new OrderRowMapper());
        return orderDto;
    }

    public List<OrderDto> getAllOrders(){
        List<OrderDto> orderDtoList = jdbcTemplate.query(SELECT_ALL_ORDER,new OrderRowMapper());
        return orderDtoList;
    }

    public void saveOrder(OrderDto orderDto){
        jdbcTemplate.update(SAVE_NEW_ORDER,
                orderDto.getId(),orderDto.getDate(),orderDto.getCost(),orderDto.getProducts());
    }

    public void deleteOrder(int id){
        jdbcTemplate.update(DELETE_ORDER_BY_ID+id);
    }

    public void updateOrder(int id , OrderDto orderDto){
        jdbcTemplate.update("UPDATE FROM order SET " +
                "date="+orderDto.getDate()+"," +
                " cost="+orderDto.getCost()+"," +
                " products="+orderDto.getProducts()+" WHERE id="+id);
    }
}
