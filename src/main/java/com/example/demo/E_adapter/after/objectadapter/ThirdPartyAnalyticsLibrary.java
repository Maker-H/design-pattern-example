package com.example.demo.E_adapter.after.objectadapter;

public class ThirdPartyAnalyticsLibrary {
    public String calculateMovingAverage(Json jsonData) {
        System.out.println("[JSON 사용 라이브러리] JSON 데이터로 일 이동평균 계산" + jsonData.toString());
        return "";
    }

    public String predictTrend(Json jsonData) {
        System.out.println("[JSON 사용 라이브러리] JSON 데이터로 추세 예측" + jsonData.toString());
        return "BULLISH";
    }

    public String analyzeVolatility(Json jsonData) {
        System.out.println("[JSON 사용 라이브러리] JSON 데이터로 변동성 분석" + jsonData.toString());
        return "";
    }
}
