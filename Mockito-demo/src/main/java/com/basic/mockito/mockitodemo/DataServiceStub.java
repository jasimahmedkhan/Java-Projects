package com.basic.mockito.mockitodemo;

class DataServiceStub implements DataService {

    @Override
    public int[] retrieveAllData() {
        return new int[] {4, 5, 6};
    }

}