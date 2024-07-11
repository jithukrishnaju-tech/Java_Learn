package com.user.design_pattern.build;

public class JkPhone {
    public static void main(String[] args) {
//        Phone phone = new Phone("Android", 8, "amd", 4000);
        //Here to build a new phone we need to give these values in correct order precisely.
        Phone phone = new PhoneBuilder().setProcessorName("amd").setOsName("android").getPhone();
        System.out.println(phone);
    }
}
