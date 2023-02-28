package class29;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapDemo {

    public static void main(String[] args) {

        // HashMap<String, Integer> groceries = new HashMap<>();
        // LinkedHashMap<String, Integer> groceries = new LinkedHashMap<>();
        TreeMap<String, Integer> groceries = new TreeMap<>();
        groceries.put("Eggs", 10);
        groceries.put("Milk", 5);
        groceries.put("Bread", 5);
        groceries.put("Rice", 2);
        groceries.put("Meat", 7);
        groceries.put("Soap", 5);

        System.out.println(groceries.get("Rice"));
        System.out.println(groceries);

        if(groceries.isEmpty() == true) {
            System.out.println("Empty");
        } else {
            System.out.println("Not empty");
        }
        System.out.println(groceries.size());
        System.out.println(groceries.remove("Meat"));
        System.out.println(groceries);
    }
}