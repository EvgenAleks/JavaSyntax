package class6.homework;

public class EvenNumbers {
    public static void main(String[] args) {

        int num1 = 20;
        while (num1 >= 2) {
            if (num1 % 2 != 0) {
            } else {
                System.out.println(num1);
            }
            num1--;
        }
        System.out.println("*****************************************");

        int num2 = 20;
        while (num2 >= 2) {
            if (num2 % 2 == 0) {
                System.out.println(num2);
            }
            num2--;
        }
    }
}