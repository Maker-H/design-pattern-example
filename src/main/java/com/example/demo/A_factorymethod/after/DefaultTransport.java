package com.example.demo.A_factorymethod.after;

public class DefaultTransport implements Transport{
    @Override
    public void deliver() {
        System.out.println("기본 제품입니다");
    }
}
