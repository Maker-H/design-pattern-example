package com.example.demo.A_factorymethod.after;

public class DefaultLogistics extends Logistics{
    @Override
    Transport createTransport() {
        return new DefaultTransport();
    }
}
