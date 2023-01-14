package class6.homework;

import java.util.Scanner;

/*
Using scanner class create calculator.
Allow user to enter 2 numbers and operator(+,-,*,/).
Based on operator provide the result to user.
 */
public class CalculatorDemo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first number");
        double num1 = input.nextDouble();
        System.out.println("Please select the operator: +, -, *, /");
        char ops = input.next().charAt(0);
        System.out.println("Please enter the second number");
        double num2 = input.nextDouble();

        switch (ops) {
            case '+':
                System.out.println("Result: " + (num1 + num2));
                break;
            case '-':
                System.out.println("Result: " + (num1 - num2));
                break;
            case '*':
                System.out.println("Result: " + (num1 * num2));
                break;
            case '/':
                System.out.println("Result: " + (num1 / num2));
                break;
        }
    }
}
