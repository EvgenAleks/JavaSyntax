package class9;

public class ArraysDemo2 {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 45, 50};
        int sum = 0;
        for (int x = 0; x < numbers.length; x++) {
            sum = sum + numbers[x];
        }
        System.out.println(sum);
    }
}
