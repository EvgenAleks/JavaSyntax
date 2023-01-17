package class8.homework;
/*
Print numbers from 1 to 50 except those that are divisible by 3.
 */

public class Task_1 {
    public static void main(String[] args) {

        int x;
        for (x = 1; x <= 50; x++) {

            if (x % 3 == 0) {
                continue;
            }
            System.out.print(x + " ");
        }
    }
}
