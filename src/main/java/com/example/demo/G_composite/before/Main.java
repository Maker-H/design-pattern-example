package com.example.demo.G_composite.before;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        SmallBox smallBox = new SmallBox(
                5,
                List.of(new Hammer(15))
        );

        BigBox bigBox = new BigBox(
                10,
                List.of(smallBox),
                List.of(new Hammer(20))
        );

        System.out.println(bigBox.getTotal());
    }
}
