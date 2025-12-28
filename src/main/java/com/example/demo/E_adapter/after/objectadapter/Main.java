package com.example.demo.E_adapter.after.objectadapter;

public class Main {
    public static void main(String[] args) {
        ThirdPartyAnalyticsLibrary thirdParty = new ThirdPartyAnalyticsLibrary();
        StockAnalysis analytics = new AnalyticsObjectAdapter(thirdParty);
        StockMonitoringApp app = new StockMonitoringApp(analytics);

        System.out.println("====== 단일 종목 분석 ======");
        app.analyzeStock("AAPL");

        System.out.println("\n====== 종목 비교 ======");
        app.compareStocks("AAPL", "GOOGL");
    }
}
