package com.example.demo.E_adapter.after.objectadapter;

public class StockDataDownloader {
    public Xml downloadStock(String symbol) {
        System.out.println("[XML 다운로드]" + symbol);
        return new Xml("<stock><symbol>" + symbol + "</symbol><price>100</price><volume>1</volume></stock>");
    }
}
