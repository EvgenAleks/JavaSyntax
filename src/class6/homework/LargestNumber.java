package class6.homework;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter three distinct numbers");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();

        if (num1 > num2) {
            if (num1 > num3)
                System.out.println("The largest number is " + num1);
        } if (num2 > num1) {
            if (num2 > num3)
                System.out.println("The largest number is " + num2);
        } if (num3 > num1) {
            if (num3 > num2)
                System.out.println("The largest number is " + num3);
        }
    }
}


