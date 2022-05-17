package com.company.junit.testing;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        System.out.println(" Printing");
//        MyMath math = new MyMath();
//        System.out.println(math.sum(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9}));

        Result result = JUnitCore.runClasses(MyMathTest.class);

        for (Failure failure: result.getFailures()){
            System.out.println(failure.toString());
        }

        System.out.println(result.wasSuccessful());


    }
}
