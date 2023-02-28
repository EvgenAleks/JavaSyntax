package class29.homework;

import java.util.TreeSet;

public class CountriesList {

    //Create a Set collection in which you need to add names of the countries.
    // In this set we want all objects to be sorted in alphabetical order.
    // Using 2 different ways retrieve all elements from set.

    public static void main(String[] args) {

        TreeSet<String> countries = new TreeSet<>();
        countries.add("Belgium");
        countries.add("China");
        countries.add("Canada");
        countries.add("USA");
        countries.add("Brazil");

        System.out.println(countries);

        for (String c : countries) {
            System.out.print(c + " ");
        }
    }
}

