package class3.homework;

/*
You are a loan specialist and you need to ask user what is the amount of loan is needed.
If loan is less or equal to 200,000 then you would lend the money otherwise you would reject the client.
 */

import java.util.Scanner;

public class Loan {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("What is the amount of loan you need?");
        int loan = input.nextInt();

        if (loan<=200000) {
            System.out.println("Loan approved");
        }else if (loan>200000) {
            System.out.println("Loan rejected");
        }
    }
}
