package class30.homework;

import java.util.LinkedList;
import java.util.List;

public class Task_5 {

//    Create a collection of integers in which you can keep duplicates.
//    Write a logic to find sum of all integers

    public static void main(String[] args) {

        List<Integer> integers = new LinkedList<>();
        integers.add(10);
        integers.add(20);
        integers.add(30);
        integers.add(40);
        integers.add(40);
        integers.add(5);
        integers.add(5);

        int sum = 0;
        for (Integer i : integers) {
            sum = sum + i;
        }
        System.out.println("The sum of all integers is: " + sum);
    }
}
