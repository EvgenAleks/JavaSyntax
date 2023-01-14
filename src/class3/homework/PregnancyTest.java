package class3.homework;

import java.util.Scanner;

public class PregnancyTest {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("How many red stripes do you see?");
        int stripe = input.nextInt();

        if (stripe == 1) {
            System.out.println("You are NOT pregnant");
        }else if (stripe == 2) {
            System.out.println("You are pregnant");
        }else if (stripe == 0) {
            System.out.println("Invalid test");
        }else {
            System.out.println("Please test your vision");
        }
    }
}
