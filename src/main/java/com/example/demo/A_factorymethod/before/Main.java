package com.example.demo.A_factorymethod.before;

public class Main {
    public static void main(String[] args) {
        LogisticsService service = new LogisticsService();
        service.planDelivery("truck");
    }
}
