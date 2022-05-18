package com.example.spring.basics.springin5steps.cdi;

import com.sun.jdi.connect.Connector;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.Arrays;

@Component
public class SomeCDIBusiness {

    @Autowired
    SomeCDIDAO someCDIDAO;

    public SomeCDIDAO getSomeCDIDAO() {
        return someCDIDAO;
    }

    public void setSomeCDIDAO(SomeCDIDAO someCDIDAO) {
        this.someCDIDAO = someCDIDAO;
    }

    public int findGreatest(){
        int greatest = Integer.MIN_VALUE;
        int[] data = someCDIDAO.getData();
        for (int value: data){
            if (value > greatest){
                greatest = value;
            }
        }
        return greatest;
    }

    public int findMinimum(){
        return Arrays.stream(someCDIDAO.getData()).min().getAsInt();
    }


}
