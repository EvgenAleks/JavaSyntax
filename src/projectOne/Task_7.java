package projectOne;

import java.util.Scanner;

public class Task_7 {
    /*
    Write a java program to check whether a given number is prime or not
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num = scan.nextInt();

        boolean prime = false;
        for (int i = 2; i <= num / 2; ++i) {
            if (num % i == 0) {
                prime = true;
                break;
            }
        }
        if (num == 1) {
            System.out.println(num + " is not a prime number.");
        } else if (!prime) {
            System.out.println(num + " is a prime number.");
        } else
            System.out.println(num + " is not a prime number.");
    }
}
