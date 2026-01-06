package com.example.demo.F_bridge.after;

public interface Device {
    void enable();
    void disable();
    boolean isEnabled();
    int getVolume();
    void setVolume(int v);
    int getChannel();
    void setChannel(int ch);
}
