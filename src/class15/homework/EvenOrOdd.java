package class15.homework;

public class EvenOrOdd {
    /*
     Create a method that will take a number and prints whether the number is even or odd.
     */
    String num1(int x) {

        if (x % 2 == 0) {
            return "Even number";

        } else {
            return "Odd number";
        }
    }

    public static void main(String[] args) {

        EvenOrOdd eOrOd = new EvenOrOdd();
        System.out.println(eOrOd.num1(134927));
    }
}


