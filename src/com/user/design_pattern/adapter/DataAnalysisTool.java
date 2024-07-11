package com.user.design_pattern.adapter;

public class DataAnalysisTool {
    String jsonData;

    public DataAnalysisTool(String jsonData) {
        this.jsonData = jsonData;
    }
    public DataAnalysisTool(){
    }
    void analyzeData(){
        System.out.println("Data is analyzing" + this.jsonData);
    }
}
