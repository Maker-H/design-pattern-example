package com.example.demo.F_bridge.before;

public class Client {
    public static void main(String[] args) {
        RadioControl radioControl = new RadioControl(new Radio());
        radioControl.togglePower();

        TvControl tvControl = new TvControl(new Tv());
        tvControl.togglePower();
    }
}
