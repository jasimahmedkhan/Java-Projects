package com.basic.mockito.mockitodemo;

public class Nike implements DataServiceShoes {


    @Override
    public int returnNumberOfShoes() {
        return 1200;
    }

    @Override
    public String[] returnShoeTypes() {
        return new String[] {"flat", "comfort", "jeans", "outdoor", "gym"};
    }
}
