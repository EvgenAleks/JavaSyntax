package class5;

import java.util.Scanner;

public class NewSwitchCaseDemo {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter any country");
        String country = scan.next();

        System.out.println(country.toLowerCase());

        switch (country.toLowerCase()) {

            case "usa":
                System.out.println("Burgers");
                break;
            case "italy":
                System.out.println("Pasta");
                break;
            case "afghanistan":
                System.out.println("Kebab");
                break;
            case "japan":
                System.out.println("Sushi");
                break;
            case "spain":
                System.out.println("Jamon");
                break;
            default:
                System.out.println("wrong country name");
        }
        scan.close();
    }
}
