package com.example.demo.D_prototype.registry;

public class Button implements Prototype {
    public String x, y, color;

    public Button(String x, String y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public Button(Button prototype) {
        this(prototype.x, prototype.y, prototype.color);
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public Prototype clone() {
        return new Button(this);
    }
}
