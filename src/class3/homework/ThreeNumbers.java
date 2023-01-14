package class3.homework;

import java.util.Scanner;

public class ThreeNumbers {
    public static void main(String[] args) {

        int a, b, c;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 3 distinct numbers");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        if ((a > b) && (a > c)) {

            System.out.println("The largest number is " + a);
        }
        if ((b > a) && (b > c)) {

            System.out.println("The largest number is " + b);
        }
        if ((c > b) && (c > a)) {

            System.out.println("The largest number is " + c);
        }
    }
}

