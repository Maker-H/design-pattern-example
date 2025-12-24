package com.example.demo.B_abstractfactory.after.factory;

import com.example.demo.B_abstractfactory.after.domain.ArtDecoChair;
import com.example.demo.B_abstractfactory.after.domain.ArtDecoSofa;
import com.example.demo.B_abstractfactory.after.domain.ArtDecoTable;
import com.example.demo.B_abstractfactory.after.domain.Chair;
import com.example.demo.B_abstractfactory.after.domain.Sofa;
import com.example.demo.B_abstractfactory.after.domain.Table;

public class ArtDecoFurnitureFactory implements FurnitureFactory{
    @Override
    public Chair createChair() {
        return new ArtDecoChair();
    }

    @Override
    public Sofa createSofa() {
        return new ArtDecoSofa();
    }

    @Override
    public Table createTable() {
        return new ArtDecoTable();
    }
}
