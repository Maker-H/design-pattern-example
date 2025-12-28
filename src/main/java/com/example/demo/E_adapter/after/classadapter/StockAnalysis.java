package com.example.demo.E_adapter.after.classadapter;


public interface StockAnalysis {
    String calculateMovingAverage(Xml xmlData);
    String predictTrend(Xml xmlData);
    String analyzeVolatility(Xml xmlData);
}
