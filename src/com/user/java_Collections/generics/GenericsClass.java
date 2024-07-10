package com.user.java_Collections.generics;

public class GenericsClass<T> {
    private T data;
    void setData(T data){
        this.data= data;
    }
    T getData(){
        return this.data;
    }
    public static void main(String[] args) {
        GenericsClass<Integer> tGenericsClass = new GenericsClass<>();
        GenericsClass<String> stringGenericsClass = new GenericsClass<>();
        tGenericsClass.setData(1);
        stringGenericsClass.setData("Jithu Krishna JU");
        System.out.println(tGenericsClass.getData());
        System.out.println(stringGenericsClass.getData()    );
    }
}
