package com.basic.mockito.mockitodemo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class SomeBusinessMockTest {

    @Test
    public void testFindTheGreatestFromAllData(){

        DataService dataServiceMock =  mock(DataService.class);
        // data.ServiceMock.retrieveAllData() ---> return new int[] {4, 5, 6};
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {4, 5, 6});

        SomeBusinessImpl someBusniess = new SomeBusinessImpl(dataServiceMock);
        int result = someBusniess.findTheGreatestFromAllData();
        assertEquals(6, result);
    }

    @Test
    public void testFindTheGreatestFromAllData_ForOneValue(){

        DataService dataServiceMock = mock(DataService.class);
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {15});

        SomeBusinessImpl someBusiness = new SomeBusinessImpl(dataServiceMock);
        int result = someBusiness.findTheGreatestFromAllData();
        assertEquals(15, result);

    }



}

