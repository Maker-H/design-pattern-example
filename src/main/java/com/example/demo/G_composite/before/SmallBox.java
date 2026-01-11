package com.example.demo.G_composite.before;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class SmallBox {
    private int price;
    private List<Hammer> hammers;

    public SmallBox(int price, List<Hammer> hammers) {
        this.price = price;
        this.hammers = hammers == null ? new ArrayList<>() : hammers;
    }

    public int getTotal() {
        int sum = price;
        for (Hammer h : hammers) {
            sum += h.getPrice();
        }
        return sum;
    }
}