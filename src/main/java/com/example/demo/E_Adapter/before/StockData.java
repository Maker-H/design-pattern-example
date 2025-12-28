package com.example.demo.E_Adapter.before;

import lombok.Getter;

@Getter
public class StockData {
    private String symbol;
    private double price;
    private int volume;
    private String timestamp;

    public StockData(String symbol, double price, int volume, String timestamp) {
        this.symbol = symbol;
        this.price = price;
        this.volume = volume;
        this.timestamp = timestamp;
    }

    public String toXml() {
        return String.format(
                "<stock><symbol>%s</symbol><price>%f</price><volume>%d</volume><timestamp>%s</timestamp></stock>",
                symbol, price, volume, timestamp
        );
    }

}
