package class11;

public class TwoDExample1 {
    public static void main(String[] args) {

        int[][] matrix = {{10, 20, 30},
                {45, 55, 66},
                {30, 40, 20, 10, 25}
        };

        for (int[] arr : matrix) {

            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
