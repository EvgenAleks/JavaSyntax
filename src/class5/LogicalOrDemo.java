package class5;

import java.util.Scanner;

public class LogicalOrDemo {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter any day of the week");
        String day = scan.next();

        if (day.equalsIgnoreCase("Monday") || day.equalsIgnoreCase("Friday")) {
            System.out.println("No class");
        } else if (day.equalsIgnoreCase("Saturday") || day.equalsIgnoreCase("Sunday")) {
            System.out.println("Java class. Enjoy!");
        } else if (day.equalsIgnoreCase("Wednesday") || day.equalsIgnoreCase("Tuesday")) {
            System.out.println("Manual testing");
        } else if (day.equalsIgnoreCase("Thursday")) {
            System.out.println("Review class");
        } else {
            System.out.println("Wrong day");
        }
        scan.close();
    }
}
