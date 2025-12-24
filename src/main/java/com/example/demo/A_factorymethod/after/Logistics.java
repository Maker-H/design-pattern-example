package com.example.demo.A_factorymethod.after;

public abstract class Logistics {

    // 팩토리 메서드
    abstract Transport createTransport();

    // 공통 로직 (템플릿 메서드)
    public void planDelivery() {
        System.out.println("배송 준비 중...");
        Transport transport = createTransport();
        transport.deliver();
        System.out.println("배송 완료!");
    }

}

