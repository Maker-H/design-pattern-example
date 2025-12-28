package com.example.demo.E_adapter.after.objectadapter;

public class XMLChartRenderer {
    public void renderPriceChart(Xml xml) {
        System.out.println("[XML 사용 차트 라이브러리] 가격 차트 렌더링" + xml.getData());
    }

    public void renderVolumeChart(Xml xml) {
        System.out.println("[XML 사용 차트 라이브러리]  거래량 차트 렌더링" + xml.getData());
    }
}
