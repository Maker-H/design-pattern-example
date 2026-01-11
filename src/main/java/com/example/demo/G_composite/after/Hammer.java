package com.example.demo.G_composite.after;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Hammer implements Product{
    private int price;

    @Override
    public int calculateTotalPrice() {
        return price;
    }
}
