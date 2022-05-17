package com.company.junit.testing;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;


// For using Junit4 for unit testing
//@RunWith(JUnitPlatform.class) // you have to import this dependency in Maven for the Runner to function.

// For JUnit5 you don't need the Runner anymore you can just create a Java class,
// create all test cases and run them from there.


public class TestAssertions {

    @Test
    public void testAssertions() {

        // test data
        String str1 = new String("abc");
        String str2 = new String("abc");
        String str3 = null;
        String str4 = "abc";
        String str5 = "abc";

        int val1 = 5;
        int val2 = 6;

        String[] expectedArray = {"one", "two", "three"};
        String[] resultArray = {"one", "two", "three"};

        // Check that two objects are equal
        assertEquals(str1, str2);

        // Check that a condition is true
        assertTrue(val1 < val2);

        // Check that a condition is false
        assertFalse(val1 > val2);

        // Check that an object isn't null
        assertNotNull(str1);

        // Check that an object is null
        assertNull(str3);

        // Check if two object references point to the same object
        assertSame(str4, str5);

        // Check if two object reference not point to the same object
        assertNotSame(str1, str3);

        // Check whether two arrays are equal to each other
        assertArrayEquals(expectedArray, resultArray);

    }

    @Test
    public void compareStrings(){
        assertEquals("Hello", "Hello");
    }

}

