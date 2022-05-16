import com.math.junit.MyMath;

import java.util.Scanner;

public class Main {

    private static MyMath myMath = new MyMath();


    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] numbers = {1,2,3,4,5,6,7,8,9};
        int result = myMath.sum(numbers);
        System.out.println("result = " + result);

        //        Scanner scanner = new Scanner(System.in);

    }
}