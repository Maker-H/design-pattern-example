package com.example.demo.G_composite.after;

import java.util.ArrayList;
import java.util.List;

public class CompoundProduct implements Product{
    private List<Product> products = new ArrayList<>();

    public void add(Product product) {
        products.add(product);
    }

    public void remove(Product product) {
        products.remove(product);
    }

    @Override
    public int calculateTotalPrice() {
        int sum = 0;
        for (Product p : products) {
            sum += p.calculateTotalPrice();
        }

        return sum;
    }
}
