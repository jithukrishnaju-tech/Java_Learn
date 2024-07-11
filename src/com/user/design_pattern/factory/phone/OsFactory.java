package com.user.design_pattern.factory.phone;

public class OsFactory {
    public Os getInstance(String str){
        if(str.equals("open")){
            return new Android();
        }
        else if(str.equals("close")){
            return new Ios();
        }
        else{
            return new Windows();
        }
    }
}
