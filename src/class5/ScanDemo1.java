package class5;

import java.util.Scanner;

public class ScanDemo1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your age");
        int age = scan.nextInt();
        System.out.println("You are " + age + " years old");
        System.out.println("");

        System.out.println("Please enter your weight");
        double weight = scan.nextDouble();
        System.out.println("You are " + weight + " kg");
        System.out.println("");

        if (age > 60 && weight >80) {
            System.out.println("You are old and fat");
            System.out.println("");
        } else
            System.out.println("You are young and fit");

        System.out.println("Are you hungry?");
        boolean hungry = scan.nextBoolean();
        System.out.println("Hungry " + hungry);

    }
}
