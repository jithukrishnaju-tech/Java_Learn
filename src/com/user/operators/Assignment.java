package com.user.operators;

public class Assignment {
    public static void main(String[] args) {
        simpleAssignment();
        compoundAssignment();
    }

    private static void compoundAssignment() {
        int a=1;
        a++;
        System.out.println(a);
    }

    private static void simpleAssignment() {
        int a;
        a=1;
    }
}
