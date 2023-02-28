package class29;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class SetDemo4 {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(30);
        System.out.println(numbers);
        // remove duplicates
        LinkedHashSet<Integer> uniqueNumbers = new LinkedHashSet<>(numbers);
        System.out.println(uniqueNumbers);
    }
}
