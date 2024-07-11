package com.user.design_pattern.build;

public class PhoneBuilder {
    String osName;
    int ramSize;
    String processorName;
    int battery;

    public PhoneBuilder setOsName(String osName) {
        this.osName = osName;
        return this;
    }

    public PhoneBuilder setRamSize(int ramSize) {
        this.ramSize = ramSize;
        return this;
    }

    public PhoneBuilder setProcessorName(String processorName) {
        this.processorName = processorName;
        return this;
    }

    public PhoneBuilder setBattery(int battery) {
        this.battery = battery;
        return this;
    }
    public Phone getPhone()
    {
        return new Phone(this.osName,ramSize,processorName, battery);
    }
}
