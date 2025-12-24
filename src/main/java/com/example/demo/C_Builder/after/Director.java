package com.example.demo.C_Builder.after;

public class Director {

    private HouseBuilder builder;

    public Director(HouseBuilder builder) {
        this.builder = builder;
    }

    public House make(String type) {
        if(type.equals("simple"))
            builder.buildGarage(1);
        else {
            builder.plantFlower(0);
        }
        return builder.get();
    }

}
