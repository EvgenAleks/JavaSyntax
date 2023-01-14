package class3.homework;

import java.util.Scanner;

/*
You are DMV representative and you need to ask customer their age.
If they are 18 and older you will issue a driver licence to them,
otherwise you will offer them to get a learners permit.
 */
public class DMV {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your age");
        int age = input.nextInt();

        if (age >= 18) {
            System.out.println("DMV will issue a driver's licence for you");
        }else if (age < 18){
            System.out.println("You need a learner's permit");
        }
    }
}
