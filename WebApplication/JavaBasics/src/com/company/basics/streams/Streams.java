package com.company.basics.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;


public class Streams {

    public static void main(String[] args) {
//        List<String> list = List.of("hello", "world");
//        System.out.println(list.get(0));

        // Functional programming way to access bounded stream of objects

        // Java Stream Usage
        // 1. Obtain a stream
        // 2. Call a zero or more non-terminal operations on Stream
        // 3. Call a terminal operation on a stream.

//        List<String> list = new ArrayList<String>();
//        list.add("Element 1");
//        list.add("Element 2");
//        list.add("Element 3");
//        list.add("Element 4");
//        list.add("Element 5");


        // ---------- Example 1 ------------

//        // 1.
//        Stream<String> stream = list.stream();
//
//        // 2.  is optional if we want to add a non-terminal operation on top of the stream.
//        // So we are basically transforming from Stream -> Stream
//        Stream<String> lowerCaseStream = stream.map((String element) -> {
//            return element.toLowerCase();
//        });
//
//        Stream<String> upperCaseStreams = lowerCaseStream.map((String element) -> {
//            return element.toUpperCase();
//        });
//
//        // 3.
//        upperCaseStreams.forEach((String element) -> {
//            System.out.println(element);
//        });

        // ---------- Example 2 ------------
        // ---------- Instead of having these intermediate values, we can use something called the method chaining

//        list.stream()
//                .map((String element) -> {return element.toLowerCase();})
//                .map((String element) -> element.toUpperCase())
//                .forEach((String element) -> {
//                    System.out.println(element);
//                });

        // ---------- more compact way of writing...

//        list.stream()
//                .map(element -> element.toLowerCase())
//                .map(element -> element.toUpperCase())
//                .forEach(element -> System.out.println(element));

        // --------- method referencing ---------

//        list.stream()
//                .map(String::toLowerCase)
//                .map(String::toUpperCase)
//                .forEach(System.out::println);

        // --------- Employing it in class

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("5000"));
        employees.add(new Employee("6000"));
        employees.add(new Employee("7000"));
        employees.add(new Employee("8000"));

        int sum = employees.stream()
                .map(employee -> employee.salary)
                .map(salary-> Integer.parseInt(salary))
                .reduce(0 , (tempSum, value) -> tempSum + value);

        System.out.println("salary sum = " + sum);


    }
}
