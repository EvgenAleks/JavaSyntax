package class3.homework;

import java.util.Scanner;

/*
Create a Java program that will ask if user has a credit card or not.
If you user does not have a credit card then offer them.
If they do have one ask what is balance on the card?
If balance of the card is larger than 1000, tell them to pay off immediately,
otherwise you can tell them that they can spend more.
 */
public class CreditCard {
    public static void main(String[] args) {

        System.out.println("Do you have a credit card?");
        System.out.println("Type Yes or No then press Enter");
        Scanner input = new Scanner(System.in);
        String card = input.next();

        if (card.equals("No")) {
            System.out.println("Would you like to issue a credit card?");
        } else if (card.equals("Yes")) {
            System.out.println("What is your current balance?");
            int balance = input.nextInt();
            if (balance > 1000) {
                System.out.println("Please pay off immediately");
            } else if (balance > 0) {
                System.out.println("You can spend more");
            }
        }

    }
}
