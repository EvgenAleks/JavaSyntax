package class3.homework;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("Please enter any integer");
        int num1 = input.nextInt();

        if (num1 % 2 == 0) {
            System.out.println("Even number");
        } else if (num1 % 2 == 1) {
            System.out.println("Odd number");
        }
    }
}
