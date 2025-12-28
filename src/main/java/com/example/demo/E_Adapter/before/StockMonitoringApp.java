package com.example.demo.E_Adapter.before;

import java.util.Map;

class StockMonitoringApp {

    private StockDataDownloader downloader;
    private XMLChartRenderer xmlChartRenderer;
    private ThirdPartyAnalyticsLibrary analytics;

    public StockMonitoringApp() {
        this.downloader = new StockDataDownloader();
        this.xmlChartRenderer = new XMLChartRenderer();
        this.analytics = new ThirdPartyAnalyticsLibrary();
    }

    public void analyzeStock(String symbol) {
        // 1. XML 형식으로 데이터 다운로드
        String xmlData = downloader.downloadStock(symbol);

        // 2. 차트 렌더링 (XML 데이터와 잘 작동)
        xmlChartRenderer.renderPriceChart(xmlData);
        xmlChartRenderer.renderVolumeChart(xmlData);

        // 분석 라이브러리 사용하려면 JSON으로 변환 필요
        // 매번 이런 변환 코드를 여기저기 작성해야 함
        String jsonData = convertToJson(xmlData);

        double movingAvg = analytics.calculateMovingAverage(jsonData, 20);
        String trend = analytics.predictTrend(jsonData);

    }

    private String convertToJson(String xmlData) {
        System.out.println("[XML -> JSON] 변환");
        return "{\"symbol\":\"%s\",\"price\":%f,\"volume\":%d,\"timestamp\":\"%s\"}";
    }

    public void compareStocks(String symbol1, String symbol2) {
        String xmlData1 = downloader.downloadStock(symbol1);
        String xmlData2 = downloader.downloadStock(symbol2);

        // 또 변환...
        String json1 = convertToJson(xmlData1);
        String json2 = convertToJson(xmlData2);

        Map<String, Double> vol1 = analytics.analyzeVolatility(json1);
        Map<String, Double> vol2 = analytics.analyzeVolatility(json2);

    }

    public static void main(String[] args) {
        StockMonitoringApp app = new StockMonitoringApp();

        System.out.println("====== 단일 종목 분석 ======");
        app.analyzeStock("AAPL");

        System.out.println("\n====== 종목 비교 ======");
        app.compareStocks("AAPL", "GOOGL");
    }
}