package class16.homework;

public class Task_1 {
    /*
    Create a method that will accept an array as parameters and will return a sum of all elements from that array.
    Method should be visibly only within same package and accessible by the creating an instance of the class.
    return type =>int
    name => sumArrayElements
    parameters => int[]arr
    acccess modifier = default
     */

    int sumArrayElements(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {

        int[] arr = {10, 25, 35, 45};
        Task_1 task1 = new Task_1();

        System.out.println(task1.sumArrayElements(arr));
    }
}

