package com.user.design_pattern.factory.phone;

public class FactoryMain {
    //This is the client application
    public static void main(String[] args) {
//        Os androidPhone= new Android();
//        Os IosPhone= new Ios();
//        Os WindowsPhone= new Windows();
//        androidPhone.spec();
//        IosPhone.spec();
//        WindowsPhone.spec();

        /*
        Instread of creating different objects in the client side we can use this factory class here
        It is OsFactory. Which will create the object, No needs to create it in the client side.

        Here factory class will give us Object.
        If we are having new classes it won't change in client it will change in the factory class which
        gives us object.
         */

        OsFactory osFactory= new OsFactory();
        osFactory.getInstance("open").spec();
        osFactory.getInstance("close").spec();
    }
}
