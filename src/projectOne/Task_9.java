package projectOne;

public class Task_9 {
    /*
    Maximum and minimum number in the array.
     */
    public static void main(String[] args) {

        int[] arr = {2, 3, 4, 45};

        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("The maximum number is " + max + " and the minimum number is " + min + ".");
    }
}
