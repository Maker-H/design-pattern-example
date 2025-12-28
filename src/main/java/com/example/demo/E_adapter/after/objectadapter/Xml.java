package com.example.demo.E_adapter.after.objectadapter;

import java.io.StringReader;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import lombok.Getter;
import org.xml.sax.InputSource;

@Getter
public class Xml {
    private String data;

    public Xml(String data) {
        validateXml(data);
        this.data = data;
    }

    private void validateXml(String data) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            factory.setNamespaceAware(true);
            factory.setFeature("http://apache.org/xml/features/disallow-doctype-decl", true);

            DocumentBuilder builder = factory.newDocumentBuilder();
            builder.parse(new InputSource(new StringReader(data)));
        } catch (Exception e) {
            throw new IllegalArgumentException("Invalid XML", e);
        }
    }


    @Override
    public String toString() {
        return "Xml{" +
                "data='" + data + '\'' +
                '}';
    }
}
