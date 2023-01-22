package class10.homework;

public class Task_5 {

    /*
    Create a 2D array or integer type where you will store odd and even numbers in 3 rows and 4 columns.
    Develop a program which will identify/print the even numbers only.
     */
    public static void main(String[] args) {

        int rows = 3;
        int columns = 4;

        int[][] arr = {{1, 2, 3, 1},
                {4, 5, 6, 1},
                {7, 8, 9, 1}
        };
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (arr[i][j] % 2 == 0) {
                    System.out.print(arr[i][j] + " ");
                }

            }
            System.out.println();
        }
    }
}

