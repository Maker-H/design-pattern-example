package com.example.demo.C_Builder.before;

public class HouseB {

    int garage;
    int garden;
    int swimmingPool;
    Integer flower;

    public HouseB(int garage, int garden, int swimmingPool, Integer flower) {
        this.garage = garage;
        this.garden = garden;
        this.swimmingPool = swimmingPool;
        this.flower = flower;
        System.out.println("B" + this);
    }

    public HouseB(int garage, int garden, int swimmingPool) {
        this(garage, garden, swimmingPool, null);
    }

    public HouseB(int garage, int garden) {
        this(garage, garden, 0, null);
    }

    public HouseB(int garage) {
        this(garage, 0, 0, null);
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
