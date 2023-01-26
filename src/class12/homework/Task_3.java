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
            String firstHalf = nameF.substring(0,nameF.length()/2);
            String secondHalf = nameM.substring(nameM.length()/2);
            System.out.println(firstHalf.concat(secondHalf));
        } else if (gender.equalsIgnoreCase("girl")) {
            String firstHalf = nameM.substring(0,nameM.length()/2);
            String secondHalf = nameF.substring(nameF.length()/2);
            System.out.println(firstHalf.concat(secondHalf));
        }
    }
}
