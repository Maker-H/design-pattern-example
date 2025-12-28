package com.example.demo.E_adapter.after.classadapter;
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

        analytics.calculateMovingAverage(xmlData);
        analytics.predictTrend(xmlData);
    }

    public void compareStocks(String symbol1, String symbol2) {
        Xml xmlData1 = xmlDownloader.downloadStock(symbol1);
        Xml xmlData2 = xmlDownloader.downloadStock(symbol2);

        analytics.analyzeVolatility(xmlData1);
        analytics.analyzeVolatility(xmlData2);
    }
}