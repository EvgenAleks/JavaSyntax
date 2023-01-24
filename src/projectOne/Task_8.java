package projectOne;

public class Task_8 {
    /*
    Write a Java Program to print the first 10 numbers of Fibonacci series.
     */
    public static void main(String[] args) {

        int a = 10;
        int first = 0;
        int second = 1;

        for (int i = 0; i <= a; i++) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }
    }
}
