package com.example.demo.E_adapter.before;

class StockMonitoringApp {

    private final StockDataDownloader xmlDownloader = new StockDataDownloader();;
    private final XMLChartRenderer legacy = new XMLChartRenderer();
    private final ThirdPartyAnalyticsLibrary thirdParty = new ThirdPartyAnalyticsLibrary();;

    public void analyzeStock(String symbol) {
        // 1. XML 형식으로 데이터 다운로드
        Xml xmlData = xmlDownloader.downloadStock(symbol);

        // 2. 차트 렌더링 (XML 데이터와 잘 작동)
        legacy.renderPriceChart(xmlData);
        legacy.renderVolumeChart(xmlData);

        // 분석 라이브러리 사용하려면 JSON으로 변환 필요
        Json jsonData = XmlToJsonConverter.convertJson(xmlData);

        thirdParty.calculateMovingAverage(jsonData);
        thirdParty.predictTrend(jsonData);

    }


    public void compareStocks(String symbol1, String symbol2) {
        Xml xmlData1 = xmlDownloader.downloadStock(symbol1);
        Xml xmlData2 = xmlDownloader.downloadStock(symbol2);

        // 또 변환...
        Json json1 = XmlToJsonConverter.convertJson(xmlData1);
        Json json2 = XmlToJsonConverter.convertJson(xmlData2);

        thirdParty.analyzeVolatility(json1);
        thirdParty.analyzeVolatility(json2);

    }


}