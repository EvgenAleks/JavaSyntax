package class29;

import java.util.HashSet;

public class SetDemo1 {

    public static void main(String[] args) {

       HashSet<String> friut = new HashSet<>();
       friut.add("Mango");
       friut.add("Kiwi");
       friut.add("Orange");
       friut.add("Mango");
        System.out.println(friut);
    }
}
