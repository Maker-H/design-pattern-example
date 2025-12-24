package com.example.demo.C_builder.after;

public class HouseA implements House {

    public int garage;
    public int garden;
    public int swimmingPool;
    public Integer flower;

    @Override
    public void print() {
        System.out.println("A" + this);
    }

    @Override
    public String toString() {
        return "HouseA{" +
                "garage=" + garage +
                ", garden=" + garden +
                ", swimmingPool=" + swimmingPool +
                ", flower=" + flower +
                '}';
    }
}
