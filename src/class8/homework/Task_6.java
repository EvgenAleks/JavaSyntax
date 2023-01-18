package class8.homework;

public class Task_6 {
    /*
    Print the following pattern:
            *

            *

            *
            **
            *
            **
            *
               */
    public static void main(String[] args) {

        for (int i = 1; i < 10; i++) {
            if (i == 2 || i == 4)
                System.out.println(" ");
            else if (i == 6 || i == 8) {
                System.out.println("**");
            } else
                System.out.println("*");
        }
    }
}


