package com.example.demo.E_Adapter.before;

import java.util.Map;

public class ThirdPartyAnalyticsLibrary {
    public double calculateMovingAverage(String jsonData, int period) {
        System.out.println("[JSON 사용 라이브러리] JSON 데이터로 일 이동평균 계산");
        return 148.50;
    }

    public String predictTrend(String jsonData) {
        System.out.println("[JSON 사용 라이브러리] JSON 데이터로 추세 예측");
        return "BULLISH";
    }

    public Map<String, Double> analyzeVolatility(String jsonData) {
        System.out.println("[JSON 사용 라이브러리] JSON 데이터로 변동성 분석");
        return Map.of("volatility", 0.25, "risk", 0.15);
    }
}
