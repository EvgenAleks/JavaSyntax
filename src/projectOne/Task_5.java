package projectOne;

public class Task_5 {
    /*
    Create a 2D array of integers.
    Develop a program which will calculate the sum of
    even and odd numbers for that array.
     */
    public static void main(String[] args) {

        int[][] arr = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 11}
        };

        int sum = 0;
        int sum2 = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] % 2 == 0) {
                    sum = sum + arr[i][j];
                }
               else if (arr[i][j] % 2 != 0) {
                    sum2 = sum2 + arr[i][j];
                }
            }
        }
        System.out.println(sum);
        System.out.println(sum2);
    }
}
