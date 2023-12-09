package com.example.javaprodz18.dto;

import java.util.Date;
import java.util.List;

public class OrderDto {
    private int id;
    private Date date;
    private double cost;
    private List<ProductDto> products;

    public OrderDto() {
    }

    public OrderDto(Date date, double cost, List<ProductDto> products) {
        this.date = date;
        this.cost = cost;
        this.products = products;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public List<ProductDto> getProducts() {
        return products;
    }

    public void setProducts(List<ProductDto> products) {
        this.products = products;
    }
}
