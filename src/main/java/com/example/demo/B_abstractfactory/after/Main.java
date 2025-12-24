package com.example.demo.B_abstractfactory.after;

import com.example.demo.B_abstractfactory.after.domain.Chair;
import com.example.demo.B_abstractfactory.after.domain.Sofa;
import com.example.demo.B_abstractfactory.after.domain.Table;
import com.example.demo.B_abstractfactory.after.factory.ArtDecoFurnitureFactory;
import com.example.demo.B_abstractfactory.after.factory.FurnitureFactory;
import com.example.demo.B_abstractfactory.after.factory.ModernFurnitureFactory;
import com.example.demo.B_abstractfactory.after.factory.VictorianFurnitureFactory;

public class Main {
    public static void main(String[] args) {
        String type = "modern";

        FurnitureFactory factory;
        if (type.equals("modern")) {
            factory = new ModernFurnitureFactory();
        } else if (type.equals("victorian")) {
            factory = new VictorianFurnitureFactory();
        } else {
            factory = new ArtDecoFurnitureFactory();
        }

        Chair chair = factory.createChair();
        Sofa sofa = factory.createSofa();
        Table table = factory.createTable();

        chair.sitOn();
        sofa.lieOn();
        table.putCoffee();

    }
}
