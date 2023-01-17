package class8.homework;

import java.util.Scanner;

/*
Write a program that reads a range of integers (start and end point),
provided by a user and then from that range prints
the sum of the even and odd integers.
 */
public class Task_3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the two numbers starting point and ending point");
        int start = scan.nextInt();
        int end = scan.nextInt();

        System.out.println("Start " + start + " End " + end);

        int evenSum = 0;
        int oddSum = 0;

        for (int x = start; x <= end; x++) {
            if (x%2 == 0) {
                evenSum += x;
            } else {
                oddSum += x;
            }
        }
        System.out.println("Sum of all the even numbers " + evenSum);
        System.out.println("Sum of all the odd numbers " + oddSum);
    }
}
