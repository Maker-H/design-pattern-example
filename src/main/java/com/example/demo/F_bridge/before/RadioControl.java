package com.example.demo.F_bridge.before;

public class RadioControl {
    private final Radio radio;

    public RadioControl(Radio radio) { this.radio = radio; }

    public void togglePower() {
        if (radio.isEnabled()) {
            radio.disable();
        } else {
            radio.enable();
        }
    }

    public void volumeUp() { radio.setVolume(radio.getVolume() + 10); }
    public void volumeDown() { radio.setVolume(radio.getVolume() - 10); }
    public void channelUp() { radio.setChannel(radio.getChannel() + 1); }
    public void channelDown() { radio.setChannel(radio.getChannel() - 1); }
}
