package com.example.demo.F_bridge.before;

import lombok.Getter;

@Getter
public class Radio {
    private boolean enabled;
    private int volume;
    private int channel;

    void enable() {
        enabled = true;
        System.out.println("라디오 켜짐");
    }
    void disable() {
        enabled = false;
        System.out.println("라디오 꺼짐");
    }

    void setVolume(int v) { volume = Math.max(0, Math.min(100, v)); }

    void setChannel(int ch) { channel = ch; }
}
