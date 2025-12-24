package com.example.demo.C_builder.before;

public class HouseA {

    int garage;
    int garden;
    int swimmingPool;
    Integer flower;

    public HouseA(int garage, int garden, int swimmingPool, Integer flower) {
        this.garage = garage;
        this.garden = garden;
        this.swimmingPool = swimmingPool;
        this.flower = flower;
        System.out.println("A" + this);
    }

    public HouseA(int garage, int garden, int swimmingPool) {
        this(garage, garden, swimmingPool, null);
    }

    public HouseA(int garage, int garden) {
        this(garage, garden, 0, null);
    }

    public HouseA(int garage) {
        this(garage, 0, 0, null);
    }
}
