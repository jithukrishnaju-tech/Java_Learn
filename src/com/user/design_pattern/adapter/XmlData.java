package com.user.design_pattern.adapter;

public class XmlData {
    String xml;
//    void setXml(String xml){
//        this.xml=xml;
//    }
//    String getXml(){
//        return this.xml;
//    }
    public XmlData(String xml) {
        this.xml = xml;
    }
    public String getData(){
        return this.xml;
    }
}
