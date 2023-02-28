package class28.homework;

import java.util.ArrayList;

public class ListOfDrinks {
 //   Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water.

    public static void main(String[] args) {

        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("Beer");
        drinks.add("Juice");
        drinks.add("Wine");
        drinks.add("Rum");


        for (int i = 0; i < drinks.size(); i++) {
            String drink = drinks.get(i);
            if(drink.contains("a") || drink.contains("e")) {
                drinks.set(i, "water");
            }
        }
        System.out.println(drinks);
    }
}
