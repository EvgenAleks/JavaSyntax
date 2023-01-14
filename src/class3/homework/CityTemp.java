package class3.homework;
/*
Create a Java program that will ask user to input city and temperature.
Your program should convert Fahrenheit into celsius and print “The temperature is the city  is ”
 */

import java.util.Scanner;

public class CityTemp {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name of your city");
        String city = input.next();

        System.out.println("Enter temerature in ºF");
        double temp = input.nextDouble();

        System.out.println("The temperature is the city " + city + " is " + ((temp-32) / 1.8) + " ºC");

    }
}
