package com.example.demo.C_builder.after;

public class HouseB implements House {

    int garage;
    int garden;
    int swimmingPool;
    Integer flower;

    @Override
    public void print() {
        System.out.println("B" + this);
    }

    @Override
    public String toString() {
        return "HouseB{" +
                "garage=" + garage +
                ", garden=" + garden +
                ", swimmingPool=" + swimmingPool +
                ", flower=" + flower +
                '}';
    }
}
