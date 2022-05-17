package com.company.junit.testing;

public class MyMath {

    int sum (int[] numbers){
        int sum = 0;
        for (int i: numbers){
            sum += i;
        }
        return sum;
    }

    int multiply (int a, int b){
        return a * b;
    }
}
