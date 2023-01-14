package class7;

public class Task3 {
    public static void main(String[] args) {

        for (int x = 1; x < 20; x++) {
            if (x % 3 != 0) {  // this condition divides all the numbers by 3 and checks if the remainder is not zero
                System.out.println(x);
            }
        }
    }
}
