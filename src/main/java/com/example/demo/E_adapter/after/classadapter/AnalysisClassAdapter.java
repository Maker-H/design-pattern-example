package com.example.demo.E_adapter.after.classadapter;

public class AnalysisClassAdapter extends ThirdPartyAnalyticsLibrary
                                    implements StockAnalysis {

    @Override
    public String calculateMovingAverage(Xml xmlData) {
        Json jsonData = XmlToJsonConverter.convertJson(xmlData);
        return super.calculateMovingAverage(jsonData);
    }

    @Override
    public String predictTrend(Xml xmlData) {
        Json jsonData = XmlToJsonConverter.convertJson(xmlData);
        return super.predictTrend(jsonData);
    }

    @Override
    public String analyzeVolatility(Xml xmlData) {
        Json jsonData = XmlToJsonConverter.convertJson(xmlData);
        return super.analyzeVolatility(jsonData);
    }
}

