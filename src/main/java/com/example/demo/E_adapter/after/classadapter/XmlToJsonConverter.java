package com.example.demo.E_adapter.after.classadapter;

import java.io.StringReader;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.InputSource;
import tools.jackson.databind.ObjectMapper;
import tools.jackson.databind.node.ObjectNode;

public class XmlToJsonConverter {

    private static final ObjectMapper MAPPER = new ObjectMapper();

    public static Json convertJson(Xml xml) {
        try {
            Document doc = DocumentBuilderFactory.newInstance()
                    .newDocumentBuilder()
                    .parse(new InputSource(new StringReader(xml.getData())));

            Element root = doc.getDocumentElement();

            ObjectNode json = MAPPER.createObjectNode();
            json.put("symbol", root.getElementsByTagName("symbol").item(0).getTextContent());
            json.put("price", Integer.parseInt(
                    root.getElementsByTagName("price").item(0).getTextContent()));
            json.put("volume", Integer.parseInt(
                    root.getElementsByTagName("volume").item(0).getTextContent()));

            return new Json(MAPPER.writeValueAsString(json));

        } catch (Exception e) {
            throw new IllegalStateException("XML → JSON conversion failed", e);
        }
    }
}
