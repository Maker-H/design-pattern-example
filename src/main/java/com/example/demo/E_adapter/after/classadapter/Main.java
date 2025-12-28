package com.example.demo.E_adapter.after.classadapter;

public class Main {
    public static void main(String[] args) {
        AnalysisClassAdapter adapter = new AnalysisClassAdapter();
        StockMonitoringApp app = new StockMonitoringApp(adapter);

        System.out.println("====== 단일 종목 분석 ======");
        app.analyzeStock("AAPL");

        System.out.println("\n====== 종목 비교 ======");
        app.compareStocks("AAPL", "GOOGL");
    }
}
