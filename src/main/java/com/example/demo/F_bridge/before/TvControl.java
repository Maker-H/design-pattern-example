package com.example.demo.F_bridge.before;

public class TvControl {
    private final Tv tv;

    public TvControl(Tv tv) { this.tv = tv; }

    public void togglePower() {
        if (tv.isEnabled()) tv.disable();
        else tv.enable();
    }

    public void volumeUp() { tv.setVolume(tv.getVolume() + 10); }
    public void volumeDown() { tv.setVolume(tv.getVolume() - 10); }
    public void channelUp() { tv.setChannel(tv.getChannel() + 1); }
    public void channelDown() { tv.setChannel(tv.getChannel() - 1); }
}
