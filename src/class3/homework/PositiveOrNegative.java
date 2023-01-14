package class3.homework;

import java.util.Scanner;

public class PositiveOrNegative {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("Please enter any integer");
        int number = input.nextInt();

        if(number>0) {
            System.out.println("Positive number");
        }else if (number<0) {
            System.out.println("Negative number");
        }else if (number==0) {
            System.out.println("Zero");
        }
    }
}
