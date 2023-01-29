package class15.homework;

public class LargerNumber {
    /*
    Create a method that will take 2 parameters as a numbers and prints which number is larger.
     */
    int maxNum(int num1, int num2) {

        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }

    public static void main(String[] args) {

        LargerNumber t1 = new LargerNumber();
        System.out.println("The larger number is: " + t1.maxNum(14, 12));
    }
}


