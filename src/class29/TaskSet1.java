package class29;

import java.util.TreeSet;

public class TaskSet1 {

    //    Create a Set collection in which you need to add names of the countries.
//    In this set we want all objects to be sorted in alphabetical order.
//    Using 2 different ways retrieve all elements from set.
    public static void main(String[] args) {

        TreeSet<String> country = new TreeSet<>();
        country.add("Gremany");
        country.add("Sweden");
        country.add("Spain");
        country.add("Zimbabwe");

        System.out.println(country);

        for(String c:country) {
            System.out.print(c + ", ");
        }
    }
}
