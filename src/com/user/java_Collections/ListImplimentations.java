package com.user.java_Collections;

import java.util.*;

public class ListImplimentations {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        List<String> stringList= new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            stringList.add(in.next());
        }
        stringList.set(1,"James Bond");
        System.out.println(stringList.indexOf("jithu"));
        stringList.remove(3);
        System.out.println(stringList.get(1));
        Iterator<String> stringIterator = stringList.iterator();
        while (stringIterator.hasNext()){
            System.out.println(stringIterator.next());
        }
//        List<String> stringList= Arrays.asList("ajith","jithu","sandip","bagath");
//
//        Iterator<String> stringIterator = stringList.iterator();
//        while(stringIterator.hasNext()){
//            System.out.println(stringIterator.next());
//        }


    }
}
