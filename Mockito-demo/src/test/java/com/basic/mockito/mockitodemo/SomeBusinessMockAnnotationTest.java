package com.basic.mockito.mockitodemo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class SomeBusinessMockAnnotationTest {

    @Mock
    DataService dataServiceMock;

    @InjectMocks
    SomeBusinessImpl someBusiness;

    @Test
    public void testFindTheGreatestFromAllData(){
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {4, 5, 6});
        assertEquals(6, someBusiness.findTheGreatestFromAllData());
    }

    @Test
    public void testFindTheGreatestFromAllData_ForOneValue(){
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {15});
        assertEquals(15, someBusiness.findTheGreatestFromAllData());

    }



}

