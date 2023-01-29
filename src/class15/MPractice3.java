package class15;

public class MPractice3 {

    /*
    Create a method that takes an array of integers sum all
    integers form the array and return the sum.
    return type => int
    name of Method => arraySum
    parameters = int[] arr
     */

    int arrSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
}
