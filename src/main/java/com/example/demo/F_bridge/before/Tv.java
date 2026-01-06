package com.example.demo.F_bridge.before;

import lombok.Getter;
import lombok.Setter;

@Getter
public class Tv {
    private boolean enabled;
    private int volume;
    private int channel;

    void enable() {
        enabled = true;
        System.out.println("tv 켜짐");
    }
    void disable() {
        enabled = false;
        System.out.println("tv 꺼짐");
    }

    void setVolume(int v) { volume = Math.max(0, Math.min(100, v)); }

    void setChannel(int ch) { channel = ch; }
}
