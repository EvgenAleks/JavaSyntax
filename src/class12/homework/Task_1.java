package class12.homework;

import java.util.Scanner;

public class Task_1 {
    /*
Create a String and if the String is not empty perform the following:
if the String has an odd number of characters and has 3 or more characters,
print the character in the middle of the String.
For Example String str=hello =>l
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter any characters");
        String str1 = scan.nextLine();


        if (str1.isBlank()) {
            System.out.println("Empty string");
        } else if (str1.length() < 3) {
            System.out.println("The string has less than 3 characters");
        } else if (str1.length() % 2 == 0) {
            System.out.println("The string has even number of characters");
        } else if (str1.length() % 2 != 0) {
            int mid = str1.length() / 2;
            System.out.println("Middle character: " + str1.charAt(mid));
        }
    }
}

