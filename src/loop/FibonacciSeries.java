package loop;

import java.util.Scanner;
//10. Write program to print Fibonacci series

public class FibonacciSeries {
    public static void main(String[] args) {
        int num1 = 0, num2 = 1, num3, i, count = 10;

        System.out.print(num1+" "+num2);

        for (i = 0; i < count; i++) {
            num3 = num1 + num2;
            System.out.println(" " + num3);
            num1 = num2;
            num2 = num3;
        }
    }
}
