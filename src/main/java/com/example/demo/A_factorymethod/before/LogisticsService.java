package com.example.demo.A_factorymethod.before;

public class LogisticsService {
    public void planDelivery(String type) {
        if (type.equals("truck")) {
            Truck truck = new Truck();
            System.out.println("배송 준비 중...");
            truck.deliver();
            System.out.println("배송 완료!");
        } else if (type.equals("ship")) {
            Ship ship = new Ship();
            System.out.println("배송 준비 중...");
            ship.deliver();
            System.out.println("배송 완료!");
        }
    }
}
