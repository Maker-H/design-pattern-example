package com.example.demo.E_adapter.after.objectadapter;

public class AnalyticsObjectAdapter implements StockAnalysis {

    private ThirdPartyAnalyticsLibrary thirdParty;

    public AnalyticsObjectAdapter(ThirdPartyAnalyticsLibrary thirdParty) {
        this.thirdParty = thirdParty;
    }

    public void calculateMovingAverage(Xml xmlData) {
        Json jsonData = XmlToJsonConverter.convertJson(xmlData);
        thirdParty.calculateMovingAverage(jsonData);
    }

    public void predictTrend(Xml xmlData) {
        Json jsonData = XmlToJsonConverter.convertJson(xmlData);
        thirdParty.predictTrend(jsonData);
    }

    public void analyzeVolatility(Xml xmlData) {
        Json jsonData = XmlToJsonConverter.convertJson(xmlData);
        thirdParty.analyzeVolatility(jsonData);
    }
}
