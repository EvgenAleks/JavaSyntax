package class9;

public class ArraysDemo {
    public static void main(String[] args) {

        String name = "John";
        String name2 = "George";
        String name3 = "Paul";
        String name4 = "Ringo";
        String name5 = "Pete";

        String[] names = {"John", "George", "Paul", "Ringo", "Pete", "Brian"};

        System.out.println(name2);
        System.out.println(names[4]);
        System.out.println(names[3]);
        System.out.println(names[5]);
        System.out.println(names[1]);
        // System.out.println(names[100]); error - out of the bound
        // System.out.println(names[-5]); error - out of the bound, min number is 0
        for (int i = 0; i <= 6; i++) {
            System.out.println(i);
        }

    }
}
