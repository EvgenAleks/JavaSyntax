package projectOne;

public class Task_3 {
    /*
    Create a 2D array of integer values.
    Print the sum of all numbers.
     */
    public static void main(String[] args) {

        int[][] arr = {{10, 22, 44},
                {12, 56, 88},
                {6, 4, 77}
        };

        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                sum = sum + arr[i][j];

            }
        }
        System.out.println(sum);
    }
}
