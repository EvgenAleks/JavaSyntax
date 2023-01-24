package class12.homework;


import java.util.Scanner;

public class Task_3 {
    /*
Write a program that reads two people's first
names and if they expecting boy or girl?
Based on the input suggests a name for a baby:
Example Output:
Mom’s first name? Mary
Dad’s first name? Daniel
Boy or Girl? boy
Suggested baby name: DANRY

Example Output:
Mom’s first name? Mary
Dad’s first name? Daniel
Boy or Girl? girl
Suggested baby name: MAIEL
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Mom's first name?");
        String nameM = scan.next();
        System.out.println("Dad's first name?");
        String nameF = scan.next();
        System.out.println("Boy or Girl?");
        String gender = scan.next();

        if (gender.equalsIgnoreCase("boy")) {
            System.out.println(nameF.substring(0, 3).concat(nameM.substring(nameF.length() - 2)).toUpperCase());
        } else if (gender.equalsIgnoreCase("girl")) {
            System.out.println(nameM.substring(0, 3).concat(nameF.substring(nameM.length() - 3)).toUpperCase());
        }
    }
}
