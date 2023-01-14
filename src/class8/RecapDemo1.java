package class8;

public class RecapDemo1 {
    public static void main(String[] args) {

        int x = 10;
        while (x >= 2) {
            System.out.println(x);
            x -= 2;
        }

        System.out.println("-------------------------------------------");

        int y = 10;
        do {
            System.out.println(y);
            y -= 2; // or y = y - 2
        } while (y >= 2);
    }
}
