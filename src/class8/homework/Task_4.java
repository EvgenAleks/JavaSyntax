package class8.homework;
/*
 Write a program to ask a user to enter item they want to buy and the price of that item.
 User will be entering 5 items.
 Every time user enters money accumulate the amount and tell the user how much is left to pay off.
 If user give more money program should return a change.
 Whenever a user done with payments program should say "Thank you for shopping!"
 */

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double totalPrice = 0;
        for (int x = 0; x < 3; x++) {

            System.out.println("Please enter the item and it's price");
            String itemName = scan.next();
            double itemPrice = scan.nextDouble();
            totalPrice = totalPrice + itemPrice;
            System.out.println("This is the total ammount you have to pay " + totalPrice);

        }
        System.out.println("Please pay for the items");
        double ammountPaid = scan.nextDouble();

        if (ammountPaid > totalPrice) {
            double change = ammountPaid - totalPrice;
            System.out.println("Here is your change " + change);

        } else if (ammountPaid < totalPrice) {
            System.out.println("You can't buy the items");
        }
        System.out.println("Thank you for shopping!");
    }
}
