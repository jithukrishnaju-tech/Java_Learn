package com.user.design_pattern.adapter;

import javax.swing.*;
import javax.xml.crypto.Data;

public class Main {
    public static void main(String[] args) {
        XmlData xmlData= new XmlData("This is xml data");
        DataAnalysisTool dataAnalysisTool = new Adapter(xmlData);
        Client client = new Client();
        client.processData(dataAnalysisTool);
    }
}
