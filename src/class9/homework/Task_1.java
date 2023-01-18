package class9.homework;

import org.w3c.dom.ls.LSOutput;

public class Task_1 {

    /*
    Create an array of chars and store grades into it: A,B,C,D,E,F.
    Then print a grade B (use 2 different ways of creating an array).
     */
    public static void main(String[] args) {

        char[] abc = {'A', 'B', 'C', 'D', 'E', 'F' };

        char[] letters = new char[6];

        letters[0] = 'A';
        letters[1] = 'B';
        letters[2] = 'C';
        letters[3] = 'D';
        letters[4] = 'E';
        letters[5] = 'F';

        System.out.println(abc[1]);
        System.out.println(letters[1]);
    }
}
