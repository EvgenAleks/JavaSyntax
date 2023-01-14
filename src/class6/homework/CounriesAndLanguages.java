package class6.homework;

import java.util.Scanner;

/*
 Ask user to enter their country and capture it.
 Once values are captured print which language user speaks.
 */
public class CounriesAndLanguages {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your country: UK, France, Sweden, Germany or Spain");
        String country = input.next();

        switch (country) {
            case "UK":
                System.out.println("You speak English");
                break;
            case "France":
                System.out.println("You speak French");
                break;
            case "Sweden":
                System.out.println("You speak Swidish");
                break;
            case "Germany":
                System.out.println("You speak German");
                break;
            case "Spain":
                System.out.println("You speak Spanish");
                break;
            default:
                System.out.println("Wrong country");
        }
    }
}
