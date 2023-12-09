package com.example.javaprodz18.dto;

public class ProductDto {
    private int id;
    private String name;
    private double cost;

    public ProductDto() {
    }

    public ProductDto(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
