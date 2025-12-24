package com.example.demo.B_abstractfactory.after.factory;

import com.example.demo.B_abstractfactory.after.domain.Chair;
import com.example.demo.B_abstractfactory.after.domain.ModernChair;
import com.example.demo.B_abstractfactory.after.domain.ModernSofa;
import com.example.demo.B_abstractfactory.after.domain.ModernTable;
import com.example.demo.B_abstractfactory.after.domain.Sofa;
import com.example.demo.B_abstractfactory.after.domain.Table;

public class ModernFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }

    @Override
    public Table createTable() {
        return new ModernTable();
    }
}
