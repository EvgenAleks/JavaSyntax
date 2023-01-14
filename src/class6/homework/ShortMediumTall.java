package class6.homework;

import java.util.Scanner;

public class ShortMediumTall {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter hight in inches");
        int height = input.nextInt();

        if (height < 60){
                System.out.println("Short");
        } else if (height >=60 && height <= 72) {
            System.out.println("Medium");
        } else if (height > 72) {
            System.out.println("Tall");
        }
    }
}
