package class28.homework;

import java.util.ArrayList;

public class ListOfWords {
//    Create an arrayList of words. Remove every word that ends with “e”.

    public static void main(String[] args) {

        ArrayList<String> fruit = new ArrayList<>();
        fruit.add("Apple");
        fruit.add("Banana");
        fruit.add("Kiwifruit");
        fruit.add("Orange");

        for(int i = 0; i < fruit.size(); i++) {
            if(fruit.get(i).endsWith("e")) {
                fruit.remove(i);
            }
        }

//        fruit.removeIf(x -> x.endsWith("e"));
        System.out.println(fruit);
    }
}
