package class6.homework;
/*
Write a program for user to enter his/hers birth month. Based on the month define the season.
Example: if user is born in June, July or August → season =”Summer”.
At the end of the program we should see output as “You were born __”.
 */

import java.util.Scanner;

public class MonthOfBirth {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your birth month");
        String month = input.next();
        String season1 = "winter";
        String season2 = "spring";
        String season3 = "summer";
        String season4 = "autumn";

        if (month.equalsIgnoreCase("December") ||
                month.equalsIgnoreCase("January") ||
                month.equalsIgnoreCase("February")) {
            System.out.println("You were born in " + season1);
        } else if (month.equalsIgnoreCase("March") ||
                month.equalsIgnoreCase("April") ||
                month.equalsIgnoreCase("May")) {
            System.out.println("You were born in " + season2);
        } else if (month.equalsIgnoreCase("June") ||
                month.equalsIgnoreCase("July") ||
                month.equalsIgnoreCase("August")) {
            System.out.println("You were born in " + season3);
        } else if (month.equalsIgnoreCase("September") ||
                month.equalsIgnoreCase("October") ||
                month.equalsIgnoreCase("November")) {
            System.out.println("You were born in " + season4);
        }
    }
}
