package com.example.demo.E_adapter.after.objectadapter;

import tools.jackson.databind.ObjectMapper;

public class Json {
    private static final ObjectMapper MAPPER = new ObjectMapper();

    private String data;

    public Json(String data) {
        validateJson(data);
        this.data = data;
    }

    private void validateJson(String data) {
        try {
            MAPPER.readTree(data);
        } catch (Exception e) {
            throw new IllegalArgumentException("Invalid JSON", e);
        }
    }

    @Override
    public String toString() {
        return "Json{" +
                "data='" + data + '\'' +
                '}';
    }
}
