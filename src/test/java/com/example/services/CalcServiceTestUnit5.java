package com.example.services;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalcServiceTestUnit5 {
    
    //beforeAll

    @BeforeAll
    public static void init(){
        System.out.println("Before all testcases:");
    }

    @BeforeEach
    public void eachTestCase(){
        System.out.println("Before Each Testcase:");
    }

    @AfterEach
    public void afterTestCase(){
        System.out.println("After each testcase:");
    }
    @AfterAll
    public static void cleanUp(){
        System.out.println("After all testcases:");
    }
    @Test
    public void addTwoNumbersTest(){
        System.out.println("First Testcase:");
       int acR = CalcService.addTwoNumbers(12, 12);
       int expec = 24;
       assertEquals(acR, expec, "Test Failed:");
    }

    @Test
    public void addAnyNumbersTest(){
        System.out.println("Second Testcase:");
        int res = CalcService.addAnyNumbers(1, 5, 7, 8);
        int expec = 21;
        assertEquals(expec, res);
    }
}
