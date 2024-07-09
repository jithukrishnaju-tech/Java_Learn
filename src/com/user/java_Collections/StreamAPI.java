package com.user.java_Collections;

import java.util.Arrays;
import java.util.List;

public class StreamAPI {
    public static void main(String[] args) {
        List<Integer> integerList= Arrays.asList(1,2,3,4,5,6);
        int sum = integerList.stream().reduce(1,(a,b) -> a+b);
        System.out.println(sum);
    }
}
