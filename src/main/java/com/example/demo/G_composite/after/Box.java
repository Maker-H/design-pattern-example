package com.example.demo.G_composite.after;

import java.util.ArrayList;
import java.util.List;

public class Box implements Product {
    private int price;
    private List<Product> products = new ArrayList<>();

    public Box(int price) {
        this.price = price;
    }

    public void add(Product product) {
        products.add(product);
    }

    public void remove(Product product) {
        products.remove(product);
    }

    @Override
    public int calculateTotalPrice() {
        int sum = price;
        for (Product p : products) {
            sum += p.calculateTotalPrice();
        }
        return sum;
    }
}