package class10.homework;

public class Task_4 {

    /*
    Create a 2D array or integer type and store numbers in 3 rows and 3 columns.
    Print the sum of all numbers.
     */

    public static void main(String[] args) {


        int[][] num = {{5, 10, 20},
                {30, 40, 60},
                {10, 10, 1},
        };

        int sum = 0;

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                sum += num[i][j];

            }
        }
        System.out.println(sum);
    }
}
