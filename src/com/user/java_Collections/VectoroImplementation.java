package com.user.java_Collections;

import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class VectoroImplementation {
    //ArrayList and Vector are almost like same. Here in Vector it is not continuous. Vector is synchronous.
    public static void main(String[] args) {
        List<Integer> integerList= new Vector<>();
        integerList.add(1);
        integerList.add(1);
        integerList.add(1);integerList.add(1);
        System.out.println(integerList);
    }
}
