package com.user.design_pattern.build;

public class Phone {
    String osName;

    @Override
    public String toString() {
        return "Phone{" +
                "osName='" + osName + '\'' +
                ", ramSize=" + ramSize +
                ", processorName='" + processorName + '\'' +
                ", battery=" + battery +
                '}';
    }

    int ramSize;
    String processorName;
    int battery;
    public Phone(String osName, int ramSize, String processorName, int battery) {
        this.osName = osName;
        this.ramSize = ramSize;
        this.processorName = processorName;
        this.battery = battery;
    }
}
