package projectOne;

public class Task_10 {
    /*
    Write a java program to find the second largest number in the array.
     */
    public static void main(String[] args) {

        int temp;
        int arr[] = {10, 200, 25, 966, 57};
        int size = arr.length;

        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {

                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("The second largest number is: " + arr[size - 2]);
    }
}

