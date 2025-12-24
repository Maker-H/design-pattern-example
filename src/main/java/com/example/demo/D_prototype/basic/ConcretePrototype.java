package com.example.demo.D_prototype.basic;

public class ConcretePrototype implements Prototype {
    public String str;

    public ConcretePrototype() {}

    public ConcretePrototype(ConcretePrototype prototype) {
        this.str = prototype.str;
    }

    @Override
    public Prototype clone() {
        return new ConcretePrototype(this);
    }

}
