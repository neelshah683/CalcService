package com.example.services;

public class CalcService {
    
    public static int addTwoNumbers(int a, int b){
        return a + b;
    }
    public static int addAnyNumbers(int... numbers){

        int sum = 0;
        for(int num : numbers)
            sum += num;
        return sum;
    }
}
