package com.user.design_pattern.adapter;

public class Adapter extends DataAnalysisTool {
    XmlData xmlData;

    Adapter(XmlData xmlData) {
        this.xmlData = xmlData;
    }
    @Override
    public void analyzeData(){
        System.out.println("Converting XML data " + xmlData.getData() + " to JSON data");
    }
}
