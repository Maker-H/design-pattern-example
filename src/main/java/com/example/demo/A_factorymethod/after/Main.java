package com.example.demo.A_factorymethod.after;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Main {
    private static final Map<String, Logistics> LOGISTICS_MAP = new ConcurrentHashMap<>();

    static {
        LOGISTICS_MAP.put("truck", new RoadLogistics());
        LOGISTICS_MAP.put("ship", new SeaLogistics());
    }

    public static Logistics create(String type) {
        return LOGISTICS_MAP.getOrDefault(type, new DefaultLogistics());
    }

    public static void main(String[] args) {
        String type = "truck";

        Logistics logistics = LOGISTICS_MAP.get(type);
        logistics.planDelivery();
    }
//        Logistics logistics = new DefaultLogistics();
//
//        if (type.equals("truck")) {
//            logistics = new RoadLogistics();
//        } else if (type.equals("ship")) {
//            logistics = new SeaLogistics();
//        }
//        logistics.planDelivery();
//    }
}
