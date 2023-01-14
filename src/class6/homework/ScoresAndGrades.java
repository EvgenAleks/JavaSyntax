package class6.homework;
/*Write a program that will read three inputs of scores
(quiz, mid term, and final scores)
and determine the grade based on the following rules:
        if the average score >=90 → grade=A
        if the average score >= 70 and <90 → grade=B
        if the average score>=50 and <70 → grade=C
        if the average score<50 → grade=F
        */

import java.util.Scanner;

public class ScoresAndGrades {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your quiz score");
        double quiz = input.nextDouble();
        System.out.println("Please enter your mid term score");
        double mid = input.nextDouble();
        System.out.println("Please enter your final score");
        double finalScore = input.nextDouble();
        double averageScore = (quiz + mid + finalScore) / 3;

        if (averageScore >= 90) {
            System.out.println("Your average score is " + averageScore + ". Grade A");
        } else if (averageScore >= 70 && averageScore < 90) {
            System.out.println("Your average score is " + averageScore + ". Grade B");
        } else if (averageScore >= 50 && averageScore < 70) {
            System.out.println("Your average score is " + averageScore + ". Grade C");
        } else if (averageScore < 50) {
            System.out.println("Your average score is " + averageScore + ". Grade F");
        }
    }
}
