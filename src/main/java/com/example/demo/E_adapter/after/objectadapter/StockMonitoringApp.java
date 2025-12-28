package com.example.demo.E_adapter.after.objectadapter;

class StockMonitoringApp {

    private final StockDataDownloader xmlDownloader = new StockDataDownloader();
    private final XMLChartRenderer legacy = new XMLChartRenderer();
    private final StockAnalysis analytics;

    public StockMonitoringApp(StockAnalysis analytics) {
        this.analytics = analytics;
    }

    public void analyzeStock(String symbol) {
        Xml xmlData = xmlDownloader.downloadStock(symbol);

        legacy.renderPriceChart(xmlData);
        legacy.renderVolumeChart(xmlData);

        // 변환 로직 없이 바로 사용!
        analytics.calculateMovingAverage(xmlData);
        analytics.predictTrend(xmlData);
    }

    public void compareStocks(String symbol1, String symbol2) {
        Xml xmlData1 = xmlDownloader.downloadStock(symbol1);
        Xml xmlData2 = xmlDownloader.downloadStock(symbol2);

        // 변환 없이 깔끔
        analytics.analyzeVolatility(xmlData1);
        analytics.analyzeVolatility(xmlData2);
    }

}