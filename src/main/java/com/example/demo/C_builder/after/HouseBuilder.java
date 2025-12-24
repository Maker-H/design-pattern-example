package com.example.demo.C_builder.after;

public interface HouseBuilder {
    HouseBuilder buildGarage(int num);
    HouseBuilder buildGarden(int num);
    HouseBuilder plantFlower(int num);
    House get();
}
