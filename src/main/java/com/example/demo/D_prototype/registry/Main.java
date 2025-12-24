package com.example.demo.D_prototype.registry;

public class Main {
    public static void main(String[] args) {
        PrototypeRegistry prototypeRegistry = new PrototypeRegistry();
        prototypeRegistry.addItem("lang", new Button("10", "40", "red"));

        Prototype red = prototypeRegistry.getByColor("red");

    }
}
