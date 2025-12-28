package com.example.demo.E_adapter.before;

public class Main {
    public static void main(String[] args) {
        StockMonitoringApp app = new StockMonitoringApp();

        System.out.println("====== 단일 종목 분석 ======");
        app.analyzeStock("AAPL");

        System.out.println("\n====== 종목 비교 ======");
        app.compareStocks("AAPL", "GOOGL");
    }
}
