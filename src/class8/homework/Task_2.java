package class8.homework;

import java.util.Scanner;

/*
Create a program that will be asking user to apply for a credit card 10 times.
As soon you get an “yes” from a user program should stop asking.
 */
public class Task_2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        for (int card = 1; card <=10; card++) {
            System.out.println("Would you like to apply for a credit card?");
            String answer = scan.next();
            if (answer.equalsIgnoreCase("yes")) {
                break;
            }
        }
    }
}
