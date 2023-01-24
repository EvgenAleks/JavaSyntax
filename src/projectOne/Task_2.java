package projectOne;

import java.util.Scanner;

public class Task_2 {
    /*
    Using Scanner create an array of countries. When an array is created,
    retrieve all values from it and while retrieving those values
    print capital for each country. (use 2 different loops).
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] country = new String[5];
        String[] capital = new String[5];
        System.out.println("Please enter 5 countries");

        country[0] = scan.next();
        country[1] = scan.next();
        country[2] = scan.next();
        country[3] = scan.next();
        country[4] = scan.next();

        for (String x : country) {
            System.out.print(x + " ");
        }
        System.out.println();
        System.out.println("Please enter capitals for these 5 countries");

        capital[0] = scan.next();
        capital[1] = scan.next();
        capital[2] = scan.next();
        capital[3] = scan.next();
        capital[4] = scan.next();

        for (int i = 0; i < country.length; i++) {
            for (int j = 0; j < capital.length; j++) {
                System.out.println(capital[j] + " is the capital of " + country[i]);
                i++;
            }
        }
    }
}
