package com.example.demo.G_composite.before;

import java.util.ArrayList;
import java.util.List;

public class BigBox {
    private int price;
    private List<SmallBox> smallBoxes;
    private List<Hammer> hammers;

    public BigBox(int price, List<SmallBox> smallBoxes, List<Hammer> hammers) {
        this.price = price;
        this.smallBoxes = smallBoxes == null ? new ArrayList<>() : smallBoxes;
        this.hammers = hammers == null ? new ArrayList<>() : hammers;
    }

    public int getTotal() {
        int sum = price;
        for (SmallBox sb : smallBoxes) {
            sum += sb.getTotal();
        }
        for (Hammer h : hammers) {
            sum += h.getPrice();
        }
        return sum;
    }
}