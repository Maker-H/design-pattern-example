package com.example.demo.C_Builder.after;

public interface HouseBuilder {
    HouseBuilder buildGarage(int num);
    HouseBuilder buildGarden(int num);
    HouseBuilder plantFlower(int num);
    House get();
}
