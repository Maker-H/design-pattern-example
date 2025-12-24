package com.example.demo.C_builder.after;

public class Main {
    public static void main(String[] args) {

        // builder 바로 사용
        House house = new HouseABuilder()
            .buildGarage(2)
            .buildGarden(1)
            .plantFlower(10)
            .get();


        // =====
        // A뼈대에 simple 조건들을 가진 집을 생성
        HouseABuilder builder = new HouseABuilder();

        Director director = new Director(builder);
        House simpleHouse = director.make("simple");
        simpleHouse.print();

    }
}
