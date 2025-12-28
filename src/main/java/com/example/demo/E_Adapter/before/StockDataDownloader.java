package com.example.demo.E_Adapter.before;

import java.util.List;
import java.util.stream.Collectors;

public class StockDataDownloader {
    public String downloadStock(String symbol) {
        System.out.println("[다운로더] " + symbol + " 주식 데이터를 XML로 다운로드");
        return new StockData(symbol, 150.25, 1000000, "2024-01-15T10:30:00").toXml();
    }
}
