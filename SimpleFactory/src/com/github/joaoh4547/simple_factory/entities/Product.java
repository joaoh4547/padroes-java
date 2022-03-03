package com.github.joaoh4547.simple_factory.entities;

public class Product {
    private Long id;
    private String description;
    private Double value;

    public Product() {
    }

    public Product(Long id, String description, Double value) {
        this.id = id;
        this.description = description;
        this.value = value;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }
}
