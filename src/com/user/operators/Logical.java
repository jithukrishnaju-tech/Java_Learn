package com.user.operators;

public class Logical {
    public static void main(String[] args) {

    }
    public boolean logicalAND(int a, int b){
        if(a >= 4 && b >= 5){
            return true;
        }
        return false;
    }
    public boolean logicalOR(int a, int b){
        return a >= 4 || b >= 5;
    }
}
