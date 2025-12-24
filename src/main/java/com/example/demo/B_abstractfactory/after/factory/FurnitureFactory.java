package com.example.demo.B_abstractfactory.after.factory;

import com.example.demo.B_abstractfactory.after.domain.Chair;
import com.example.demo.B_abstractfactory.after.domain.Sofa;
import com.example.demo.B_abstractfactory.after.domain.Table;

public interface FurnitureFactory {
    Chair createChair();
    Sofa createSofa();
    Table createTable();
}
