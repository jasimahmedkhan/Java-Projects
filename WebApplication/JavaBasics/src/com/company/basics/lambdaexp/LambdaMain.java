package com.company.basics;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Comparator;

public class Main {

    static String thirdText = "hey, how are you !!";

    // Lambda expression are java objects that implement is an anonymous
    // implementation of a functional interface
    public static void main(String[] args) throws FileNotFoundException {

        //----------- In class implementation of an Anonymous Function -------------

        // creating an implementation of the anonymous function from a functional interface
        // using pre-lambda style:
//        Comparator<String> stringComparator = new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.compareTo(o2);
//            }
//        };
//
//        int comparison = stringComparator.compare("hello", "hello");
//        System.out.println("comparator = " + comparison);

        //----------- Lambda Functionality -------------

//        // creating an anonymous method implementation from a functional interface
//        // using lambda style:
////        Comparator<String> stringComparatorLambda =
////                (String o1, String o2) -> { return o1.compareTo(o2);};
//
//        // another way of writing it
//        Comparator<String> stringComparatorLambda =
//                (o1, o2) -> o1.compareTo(o2);
//
//        int lambdaComparison = stringComparatorLambda.compare("hello", "hello");
//        System.out.println("lambda expression result = " + lambdaComparison);

        // -------- Calling the custom interface using the lambda function ------

        // ---- example 1
//        MyFunction myFunction = () -> {
//            System.out.println("Hello word custom interface with lambda impl");
//        };
//        myFunction.apply();

        // ---- example 2

//        MyFunction myFunction = (text) -> System.out.println("Hi " + text);
//        myFunction.apply("Hello world");

        // ---- example 3

//        MyFunction myFunction = (String text1,  String text2) -> {
//            System.out.println(text1 + " " + text2 + " Inside the function");
//            return text1 + " " + text2;
//        };
//
//        String resultText = myFunction.apply("Hello", "World");
//        System.out.println(resultText);

        // ---- example 4

//        MyFunction myFunction2 = myFunction;
//        String resultText2 = myFunction2.apply("From ", "Other Side !! Wink...");
//        System.out.println(resultText);


        /* ---------- Using the functional Interface  ----------*/

        // Java lambda expression can implement interface with
        // a single unimplemented method (abstract) method,
        // but as many default or static methods as you like.

//        MyInterface myInterface = (String text) -> {
//            System.out.println(text);
//        };
//
//        myInterface.print("Hello Uncle BOB");
//
//        /* Accessing the default method in the interface */
//        myInterface.printUtf8To("Hello File", new FileOutputStream("data.text"));
//
//        MyInterface.printItToSystemOut("Hello out from the static method");
//

        /* ----------- Variable Capture in the function interface */

//        https://www.youtube.com/watch?v=kBc8S40HdoM&list=PLL8woMHwr36HQhhPPdV_T8rigbuywMpD7&index=4

        String secondText = " Hey, a third text";

        MyInterface myInterface = (String text) -> {
            System.out.println(secondText + thirdText + text);
        };

        myInterface.print(" is written !!!");


        thirdText = " what are you saying ";


        myInterface.print(" is written !!!");


    }
}
