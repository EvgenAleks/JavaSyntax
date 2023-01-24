package projectOne;

import java.util.Scanner;

public class Task_1 {
    /*
    Using Scanner create an array of integer values.
    After the array is created,
    calculate the sum of all stored elements in that array.
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int x;
        System.out.println("Enter the number of elements you want to store: ");
        x = scan.nextInt();
        int[] arr = new int[x];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < x; i++) {
            arr[i] = scan.nextInt();
        }

            int sum = 0;
            for (int p : arr) {
                sum = sum + p;
            }
                System.out.println("Total sum: " + sum);
            }
        }


