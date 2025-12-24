package com.example.demo.D_prototype.basic;

public class SubclassPrototype extends ConcretePrototype {
    public String subStr;

    public SubclassPrototype() {
        super();
    }

    public SubclassPrototype(SubclassPrototype prototype) {
        super(prototype);
        this.str = prototype.subStr;
    }
    @Override
    public Prototype clone() {
        return new SubclassPrototype(this);
    }

    @Override
    public String toString() {
        return "SubclassPrototype{" +
                "subStr='" + subStr + '\'' +
                ", str='" + str + '\'' +
                '}';
    }
}
