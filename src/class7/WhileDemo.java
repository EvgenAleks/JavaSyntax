package class7;

import java.util.Scanner;

public class WhileDemo {
    public static void main(String[] args) {

        boolean condition = true;
        Scanner scan = new Scanner(System.in);
        int num = 11;
        while (condition) {
            System.out.println("Please enter a number between 10 to 20");
            int userInput = scan.nextInt();
            if (userInput > num) {
                System.out.println("You entered number is greater");
            } else if (userInput < num) {
                System.out.println("You entered a smaller number");
            } else {
                System.out.println("You won!");
                condition = false;
            }
        }
    }
}
