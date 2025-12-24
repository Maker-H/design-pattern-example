package com.example.demo.C_builder.after;

public class HouseBBuilder implements HouseBuilder {
    private HouseB house = new HouseB();

    @Override
    public House get() {
        House result = this.house;
        this.house = new HouseB();
        return result;
    }

    @Override
    public HouseBuilder buildGarage(int num) {
        this.house.garage = num;
        return this;
    }

    @Override
    public HouseBuilder buildGarden(int num) {
        this.house.garden = num;
        return this;
    }

    @Override
    public HouseBuilder plantFlower(int num) {
        this.house.flower = num;
        return this;
    }
}
