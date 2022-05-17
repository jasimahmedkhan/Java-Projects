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

        // For Manually adding the JunitCore Runner for running all the tests in Junit 4
        Result result = JUnitCore.runClasses(JunitAnnotation.class);

        for (Failure failure: result.getFailures()){
            System.out.println(failure.toString());
        }

        System.out.println("the test are successful = " + result.wasSuccessful());

    }
}
