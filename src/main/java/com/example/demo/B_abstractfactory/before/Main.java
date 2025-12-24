package com.example.demo.B_abstractfactory.before;

public class Main {
    public static void main(String[] args) {
        String type = "modern";

        orderChair(type);
        orderSofa(type);
        orderTable(type);

    }

    public static void orderChair(String style) {
        if (style.equals("modern")) {
            new ModernChair().sitOn();
        } else if (style.equals("victorian")) {
            new VictorianChair().sitOn();
        } else if (style.equals("artdeco")) {
            new ArtDecoChair().sitOn();
        }
    }

    public static void orderSofa(String style) {
        if (style.equals("modern")) {
            new ModernSofa().lieOn();
        } else if (style.equals("victorian")) {
            new VictorianSofa().lieOn();
        } else if (style.equals("artdeco")) {
            new ArtDecoSofa().lieOn();
        }
    }

    public static void orderTable(String style) {
        if (style.equals("modern")) {
            new ModernTable().putCoffee();
        } else if (style.equals("victorian")) {
            new VictorianTable().putCoffee();
        } else if (style.equals("artdeco")) {
            new ArtDecoTable().putCoffee();
        }
    }
}
