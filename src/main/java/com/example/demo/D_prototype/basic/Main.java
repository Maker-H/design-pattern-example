package com.example.demo.D_prototype.basic;

public class Main {
    public static void main(String[] args) {
        SubclassPrototype subclassPrototype = new SubclassPrototype();
        subclassPrototype.subStr = "sub - sub";
        subclassPrototype.str = "sub - str";
        System.out.println(subclassPrototype);

        SubclassPrototype cloned = (SubclassPrototype) subclassPrototype.clone();
        cloned.subStr = "new sub";
        cloned.str = "new str";
        System.out.println(cloned);
        System.out.println(subclassPrototype);
    }
}
