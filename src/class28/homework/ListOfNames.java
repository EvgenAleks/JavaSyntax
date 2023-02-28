package class28.homework;

import java.util.ArrayList;

public class ListOfNames {
//    Create an ArrayList that will store 5 names into it.
//    Find out whether the given ArrayList is empty or not?
//    Check whether the specific name is present in an ArrayList or not?
//    Find the size of your arrayList and print all values from that.

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("John");
        names.add("George");
        names.add("Paul");
        names.add("Ringo");
        names.add("Pete");

        System.out.println(names.isEmpty());
        System.out.println(names.contains("Paul"));
        System.out.println(names.size() + " " + names);

    }
}
