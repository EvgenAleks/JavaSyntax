package projectOne;

import java.util.Scanner;

public class Task_1_ver_2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 5 numbers");
        int[] num = new int[5];
        num[0] = scan.nextInt();
        num[1] = scan.nextInt();
        num[2] = scan.nextInt();
        num[3] = scan.nextInt();
        num[4] = scan.nextInt();

        int sum = 0;
        for(int i : num) {
            sum = sum + i;
        }
            System.out.println(sum);
        }
    }

