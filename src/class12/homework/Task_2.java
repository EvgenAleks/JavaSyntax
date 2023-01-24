package class12.homework;

import java.util.Scanner;

public class Task_2 {
    /*
    Create a String and print it in reverse order (Sunday → yadnuS)
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter text");
        String word = scan.nextLine();
        String reverse = new String();

        for (int i = word.length() - 1; i >= 0; i--) {
            reverse = reverse + word.charAt(i);

        }
        System.out.println(reverse);
    }
}
