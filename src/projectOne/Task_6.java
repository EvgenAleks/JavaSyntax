package projectOne;

import java.util.Scanner;

public class Task_6 {
    /*
    Write a program to swap 2 numbers without a temporary variable.
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter two numbers");
        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();
        System.out.println("Before swap");
        System.out.println("Fitst number: " + num1);
        System.out.println("Second number: " + num2);

        num1 = num1 - num2;
        num2 = num1 + num2;
        num1 = num2 - num1;

        System.out.println("After swap");
        System.out.println("Fitst number: " + num1);
        System.out.println("Second number: " + num2);

    }
}
