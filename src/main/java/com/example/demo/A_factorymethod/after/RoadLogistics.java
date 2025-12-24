package com.example.demo.A_factorymethod.after;

public class RoadLogistics extends Logistics {
    private Truck cachedTruck;

    @Override
    public synchronized Transport createTransport() {
        if (cachedTruck == null) {
            cachedTruck = new Truck();
        }

        return cachedTruck;
    }
}
