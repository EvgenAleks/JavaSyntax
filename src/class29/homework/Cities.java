package class29.homework;

import java.util.LinkedHashSet;

public class Cities {
//    Create a Set of cities in which you want to make sure that insertion order is maintained.
//    Then remove any city that starts with “A”;

    public static void main(String[] args) {

        LinkedHashSet<String> cities = new LinkedHashSet<>();
        cities.add("Amstredam");
        cities.add("Berlin");
        cities.add("Rome");
        cities.add("Antwerp");

//        for(int i = 0; i < cities.size(); i++) {
//            if (cities.getClass(i).startsWith("A")) {
//
//            }
//        }

        // cities.removeIf(x -> x.startsWith("A")||x.startsWith("a"));
        System.out.println(cities);
    }

}
