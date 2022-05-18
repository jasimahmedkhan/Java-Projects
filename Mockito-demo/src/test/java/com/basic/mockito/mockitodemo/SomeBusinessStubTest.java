package com.basic.mockito.mockitodemo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class SomeBusinessStubTest {

    @Test
    public void testFindTheGreatestFromAllData(){
        SomeBusinessImpl someBusniess = new SomeBusinessImpl(new DataServiceStub());
        int result = someBusniess.findTheGreatestFromAllData();
        assertEquals(6, result);
    }
}

