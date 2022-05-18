package com.basic.mockito.mockitodemo;

public class SomeBusinessShoeImpl {

    private DataServiceShoes dataServiceShoes;

    SomeBusinessShoeImpl(DataServiceShoes dataServiceShoes){
        this.dataServiceShoes = dataServiceShoes;
    }

    public String retrieveBestShoeType(){
        String[] shoeTypes = dataServiceShoes.returnShoeTypes();
        System.out.println("the best shoe = " + shoeTypes[4]);
        return shoeTypes[4];
    }
    

    public int retrieveShoeNumber(){
        int numberOfShoes = dataServiceShoes.returnNumberOfShoes();
        System.out.println("number of shoes this season = " + numberOfShoes);
        return numberOfShoes;
    }

}
