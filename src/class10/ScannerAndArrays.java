package class10;

import java.util.Arrays;
import java.util.Scanner;

public class ScannerAndArrays {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 5 numbers");
        int[] arr = new int[5];

        //below code manually store numbers in the array
    /*    numbers[0]=40;
        arr[1]=50;
        arr[3]=60;
        arr[2]=70;
        arr[4]=80;*/

        // Below code take the numbers from user and store them in the array its good but a lot of code
    /*    arr[0] = scan.nextInt();
        arr[1] = scan.nextInt();
        arr[3] = scan.nextInt();
        arr[2] = scan.nextInt();
        arr[4] = scan.nextInt();
*/
        // Below code uses a normal for loop to ask the user for numbers and store them in the array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(arr));
    }
}
