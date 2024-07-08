package com.user.operators;

public class ArithmeticOperation {
    public static void main(String[] args) {
        int addition_ans=addition(1,3);
        int subtraction_ans= subtraction(3,1);
        float division_ans= division(6,3);
        int multiplication_ans=multiplication(1,2);
        float modulus_ans=modulusans(5,2);
        System.out.println(addition_ans + " " + subtraction_ans + " " + division_ans + " " + multiplication_ans + " " + modulus_ans);
    }

    private static float modulusans(float a, float b) {
        return a % b;
    }

    private static int multiplication(int a, int b) {
        return a*b;
    }

    private static float division(float a, float b) {
        return a/b;
    }

    private static int subtraction(int a, int b) {
        return a-b;
    }

    public static int addition(int a, int b){
        return a+b;
    }
}
