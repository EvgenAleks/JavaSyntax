package class10;

import java.util.Arrays;

public class TwoDArraysDemo1 {
    public static void main(String[] args) {
        //                 0    1   3
        int[][] matrix = {{10, 20, 30}, // row index 0
                {55, 22, 45, 450}, // row index 1
                {100, 220, 450},  // row index 2
        };
        //   System.out.println(matrix[2][1]);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        }
    }
}
