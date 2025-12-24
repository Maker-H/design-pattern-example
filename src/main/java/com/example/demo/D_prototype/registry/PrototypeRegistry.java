package com.example.demo.D_prototype.registry;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class PrototypeRegistry {
    private Map<String, Prototype> items = new ConcurrentHashMap<>();

    public void addItem(String id, Prototype prototype) {
        items.put(id, prototype);
    }

    public Prototype getById(String id) {
        return items.get(id).clone();
    }

    public Prototype getByColor(String color) {
        Collection<Prototype> values = items.values();
        for (Prototype p : values) {
            if (p.getColor().equals(color)) {
                return p.clone();
            }
        }
        return null;
    }
}
