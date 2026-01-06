package com.example.demo.F_bridge.after;


public class Client {
    public static void main(String[] args) {
        RemoteControl radioControl = new RemoteControl(new Radio());
        radioControl.togglePower();

        RemoteControl tvControl = new RemoteControl(new Tv());
        tvControl.togglePower();

        AdvancedRemoteControl remoteControl = new AdvancedRemoteControl(new Tv());
        remoteControl.mute();
    }
}
