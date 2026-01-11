package com.example.demo.G_composite.after;

public class Client {
    public static void main(String[] args) {
        // 작은 박스에 망치를 담음
        Box smallBox = new Box(5);
        smallBox.add(new Hammer(15));

        // 큰 박스에 작은 박스와 망치를 담음
        Box bigBox = new Box(10);
        bigBox.add(smallBox);  // 박스 안에 박스!
        bigBox.add(new Hammer(20));

        System.out.println(bigBox.calculateTotalPrice()); // 150

        // 단일 상품도 동일한 방식으로 다룰 수 있음
        Product hammer = new Hammer(30);
        System.out.println(hammer.calculateTotalPrice()); // 30
    }
}
