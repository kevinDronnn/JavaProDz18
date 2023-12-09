package com.example.javaprodz18.repository.mappers;

import com.example.javaprodz18.dto.OrderDto;
import com.example.javaprodz18.dto.ProductDto;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class OrderRowMapper implements RowMapper<OrderDto> {
    @Override
    public OrderDto mapRow(ResultSet rs, int rowNum) throws SQLException {
        OrderDto orderDto = new OrderDto();
        orderDto.setId(rs.getInt("id"));
        orderDto.setCost(rs.getDouble("cost"));
        orderDto.setDate(rs.getDate("date"));
        orderDto.setProducts((List<ProductDto>) rs.getArray("products"));
        return orderDto;
    }
}
