package com.basic.mockito.mockitodemo;


public class SomeBusinessImpl {

    private DataService dataService;

    SomeBusinessImpl(DataService dataService){
        this.dataService = dataService;
    }


    int findTheGreatestFromAllData(){
        int[] data = dataService.retrieveAllData();
        int greatest = Integer.MIN_VALUE;
        System.out.println("the minimum value = " + greatest);

        for (int value: data){
            if (value > greatest){
                greatest = value;
            }
        }
        return greatest;
    }

}

