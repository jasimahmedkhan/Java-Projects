package com.basic.mockito.mockitodemo;

import org.junit.jupiter.api.Test;

//import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class SomeBusinessMockShoe {

    @Test
    public void findTheNumberOfShoes(){

//        SomeBusinessShoeImpl someBusinessShoe = new SomeBusinessShoeImpl(new Nike());
//        int shoeNumber = someBusinessShoe.retrieveShoeNumber();
//        String BusinessShoe = someBusinessShoe.retrieveBestShoeType();
//
//        assertEquals(1200, shoeNumber);

        DataServiceShoes dataServiceShoesMock = mock(DataServiceShoes.class);

        when(dataServiceShoesMock.returnNumberOfShoes()).thenReturn(1200);

        SomeBusinessShoeImpl someBusinessShoe = new SomeBusinessShoeImpl(dataServiceShoesMock);
        int result = someBusinessShoe.retrieveShoeNumber();

        assertEquals(1200, result);


    }

}
