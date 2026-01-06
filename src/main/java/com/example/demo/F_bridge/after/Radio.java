package com.example.demo.F_bridge.after;

import lombok.Getter;

@Getter
public class Radio implements Device {
    private boolean enabled;
    private int volume;
    private int channel;

    @Override
    public void enable() {
        enabled = true;
        System.out.println("라디오 켜짐");
    }

    @Override
    public void disable() {
        enabled = false;
        System.out.println("라디오 꺼짐");
    }

    @Override
    public void setVolume(int v) { volume = Math.max(0, Math.min(100, v)); }

    @Override
    public void setChannel(int ch) { channel = ch; }
}
