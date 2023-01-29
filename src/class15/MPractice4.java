package class15;

public class MPractice4 {
    /*
    create a method that takes two numbers as parameters and return the larger number

    return type => int
    name => maxNum
    parameters => int num1, int num2
    {
    if
    }
     */

    int maxNum(int num1, int num2) {

        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }

    public static void main(String[] args) {

        MPractice4 mp4 = new MPractice4();
        System.out.println(mp4.maxNum(10, 15));
    }
}