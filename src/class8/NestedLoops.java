package class8;

public class NestedLoops {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) { // outer for loop

            for (int j = 0; j < 2; j++) { // inner for loop
                System.out.println("Loop " + j);

            }
            System.out.println("***************************");
        }
    }
}
