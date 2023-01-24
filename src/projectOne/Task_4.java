package projectOne;

public class Task_4 {
    /*
    Create a 2D array or integer type where you will store odd and even numbers.
    Develop a program which will identify/print the even numbers only.
     */
    public static void main(String[] args) {

        int[][] arr = {{15, 22, 44},
                {12, 59, 88},
                {63, 4, 77}
        };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] % 2 == 0) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
        System.out.println();
    }
}