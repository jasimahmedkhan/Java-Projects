package com.company.junit.testing;


import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


 // For using Junit5 for unit testing. StandAlone TestRunner
// https://www.baeldung.com/junit-5-runwith

public class MyMathTest {
    private MyMath myMath = new MyMath();

    /*
    * Check that you are using Junit4 because from Junit5 onwards @Before/@After is now @BeforeEach/@AfterEach
    * and similarly @BeforeClass/@AfterClass is @AfterAll/@BeforeAll.
    * link:
    *   https://blog.jetbrains.com/idea/2020/08/migrating-from-junit-4-to-junit-5/
    *   https://stackoverflow.com/questions/10580613/after-before-not-working-in-testcase
    *   https://howtodoinjava.com/junit5/before-all-annotation-example/
    *   https://www.tutorialspoint.com/junit/junit_using_assertion.htm
    *   https://www.guru99.com/junit-assert.html
    *   https://junit.org/junit4/javadoc/4.8/org/junit/Assert.html
    *
    * */

    // this method is run before All the tests are executed, to initialize the variables and general setup.
    // It is a class level method, it is best to make it static.
    @BeforeAll
    public static void beforeClass(){
        System.out.println("Before Class");
    }

    // if some clean up needs to get done after each test then this method can be used.
    @AfterAll
    public static void afterClass(){
        System.out.println("After Class");
    }

    // this method is run before each test is executed.
    @BeforeEach
    public void before(){
        System.out.println("Before");
    }

    // if some clean up needs to get done after each test then this method can be used.
    @AfterEach
    public void after(){
        System.out.println("After");
    }

    @Test
    @DisplayName("Sum with three Numbers")
    public void sum_withThreeNumbers() {
//        fail("Not implemented yet");
        // Check that the result is 6
        // check result 6
        System.out.println("Test 1");
        assertEquals(6, myMath.sum(new int[] {1,2,3}));
    }

    @Test
    @DisplayName("Sum with One Number")
    public void sum_withOneNumbers() {
        System.out.println("Test 2");
        assertEquals(3, myMath.sum(new int[] { 3 }));
    }

    @Test
    @DisplayName("A simple test")
    public void test() {
        System.out.println("Simple test getting executed !!");
    }

    @Test
    public void standardAssertions() {
        assertEquals(6, myMath.sum(new int[] {1,2,3}));
        assertEquals(4, myMath.multiply(2, 2),
                "The optional failure message is now the last parameter");
        assertTrue(true, "Assertion messages can be lazily evaluated -- "
                + "to avoid constructing complex messages unnecessarily.");
    }



}