package org.example.Head03.OOP.GS.example;

public class Product {
    private String productId;
    private String name;
    private double price;


    public Product(String productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
