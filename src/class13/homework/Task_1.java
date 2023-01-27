package class13.homework;

public class Task_1 {
    /*
    Create a String that will hold a sentence.
    Write a program to get a new String without any spaces.
     */
    public static void main(String[] args) {

        String str = "On the sunny side of the street.";
        System.out.println(str);
        String str1;
        str1 = str;
        System.out.println(str1.replaceAll(" ", ""));
    }
}
