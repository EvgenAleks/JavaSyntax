package class13.homework;

import java.util.Scanner;

public class Task_5 {
    /*
    How would you check if String is palindrome or not?
    aba=> true
    Abbc =>false
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String palDr;
        System.out.println("Please enter a word");
        palDr = scan.next();
        String rev = "";

        for (int i = palDr.length() - 1; i >= 0; i--) {
            rev = rev + palDr.charAt(i);
        }
            if (rev.equalsIgnoreCase(palDr)) {
                System.out.println("This is a palindrome");

            } else {
                System.out.println("This is not a palindrome");
            }
        }
    }



