package class30.homework;

import java.util.LinkedHashSet;

public class Task_4 {

//    Create the collection that will store single uniques
//    Objects of a String type in which order is preserved.
//    Write a logic to concatenate all string from the collection.

    public static void main(String[] args) {

        LinkedHashSet<String> stringSet = new LinkedHashSet<>();

        stringSet.add("Lucy");
        stringSet.add("in");
        stringSet.add("the");
        stringSet.add("sky");
        stringSet.add("with");
        stringSet.add("diamonds");

        for (String str : stringSet) {

            System.out.print(str + " ");
        }
    }
}
