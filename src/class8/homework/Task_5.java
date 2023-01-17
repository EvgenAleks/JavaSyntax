package class8.homework;

public class Task_5 {

    /*
    Print the following pattern:
55555
4444
333
22
1
     */
    public static void main(String[] args) {

        for (int i = 5; i > 0; i--) {
            for (int p = 1; p <= i; p++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}