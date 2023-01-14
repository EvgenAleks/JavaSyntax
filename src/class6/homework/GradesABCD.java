package class6.homework;

import java.util.Scanner;

/*
Allow user to enter grade and then provide explanation:
A-Excellent, B-Good, C-Average, D-Bad, any other grade --> Not Acceptable.
At the end your program should print which grade was entered by a user with explanation.
 */
public class GradesABCD {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your grade: A, B, C or D");
        char grade = input.next().charAt(0);

        switch (grade) {

            case 'A':
                System.out.println("Exellent");
                System.out.println("You have entered the Exellent grade.");
                break;
            case 'B':
                System.out.println("Good");
                System.out.println("You have entered the Good grade.");
                break;
            case 'C':
                System.out.println("Average");
                System.out.println("You have entered the Average grade.");
                break;
            case 'D':
                System.out.println("Bad");
                System.out.println("You have entered the Bad grade.");
                break;
            default:
                System.out.println("Not Acceptable");
        }
    }
}
