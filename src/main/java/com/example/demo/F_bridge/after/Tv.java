package com.example.demo.F_bridge.after;

import lombok.Getter;
import lombok.Setter;

@Getter
public class Tv implements Device {
    private boolean enabled;
    private int volume;
    private int channel;

    @Override
    public void enable() {
        enabled = true;
        System.out.println("tv 켜짐");
    }

    @Override
    public void disable() {
        enabled = false;
        System.out.println("tv 꺼짐");
    }

    @Override
    public void setVolume(int v) { volume = Math.max(0, Math.min(100, v)); }

    @Override
    public void setChannel(int ch) { channel = ch; }
}
