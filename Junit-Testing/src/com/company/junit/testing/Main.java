package com.company.junit.testing;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(" Printing");
        MyMath math = new MyMath();
        int result = math.sum(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9});
        System.out.println(result);
    }
}
