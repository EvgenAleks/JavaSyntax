package class13.homework;

import java.util.Scanner;

public class Task_6 {
    /*
    How would you swap  2 strings without a temporary variable?
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter two words");
        String word1 = scan.next();
        String word2 = scan.next();
        System.out.println("Before swap");
        System.out.println("Fitst word: " + word1);
        System.out.println("Second word: " + word2);

        word1 = word1 + word2;
        word2 = word1.substring(0, word1.length() - word2.length());
        word1 = word1.substring(word2.length());

        System.out.println("After swap");
        System.out.println("Fitst number: " + word1);
        System.out.println("Second number: " + word2);
    }
}
