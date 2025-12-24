package com.example.demo.B_abstractfactory.after.factory;

import com.example.demo.B_abstractfactory.after.domain.Chair;
import com.example.demo.B_abstractfactory.after.domain.Sofa;
import com.example.demo.B_abstractfactory.after.domain.Table;
import com.example.demo.B_abstractfactory.after.domain.VictorianChair;
import com.example.demo.B_abstractfactory.after.domain.VictorianSofa;
import com.example.demo.B_abstractfactory.after.domain.VictorianTable;

public class VictorianFurnitureFactory implements FurnitureFactory{
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }

    @Override
    public Table createTable() {
        return new VictorianTable();
    }
}
