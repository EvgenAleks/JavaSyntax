package class9.homework;

public class Task_5 {
    /*
    Create an array of size 5 on integers and calculate the sum of all elements in an array.
     */
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }
}