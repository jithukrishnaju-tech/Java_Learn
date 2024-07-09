package com.user.java_Collections;

import java.util.HashMap;
import java.util.*;
public class MapImplementation {
    public static void main(String[] args) {
        Map<Integer, String > map= new HashMap<>();
        map.put(1,"java");
        map.put(2,"c");
        map.put(3,"javaScript");
        System.out.println(map);
        System.out.println(map.keySet() );
        // Iterate over keys
        System.out.println("Keys in the map:");
        for (Integer key : map.keySet()) {
            System.out.println(key);
        }

        // Iterate over values
        System.out.println("Values in the map:");
        for (String value : map.values()) {
            System.out.println(value);
        }
    }
}
