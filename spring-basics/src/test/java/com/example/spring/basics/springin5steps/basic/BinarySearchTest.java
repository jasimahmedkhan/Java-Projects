package com.example.spring.basics.springin5steps.basic;

import com.example.spring.basics.springin5steps.SpringIn5StepsBasicApplication;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;


// load the context
@ExtendWith(SpringExtension.class)
//@ContextConfiguration(classes = SpringIn5StepsBasicApplication.class)
// //  for loading spring application using the xml defined application context
@ContextConfiguration(locations = "/applicationContext.xml")
class BinarySearchTest {

    // get this bean from the context
    @Autowired
    BinarySearchImpl binarySearch;

    @Test
    public void testBasicScenaio(){
        int result = binarySearch.binarySearch(new int[] {}, 5);
        assertEquals(3, result);
        // call method on binarySearch
        // check if the value is correct


    }

}