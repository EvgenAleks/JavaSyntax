package class15.homework;

import javax.sound.midi.Soundbank;

public class Student {
    /*
Create  class Student that will have a method getGrade.
Your method should accept the score of a student and return a grade:
score > 90 - A
score >80 - B
score >70 - C
score > 50 - D
anything else - F
 */
    String student(int score) {

        if (score > 90) {
            return "Grade A";
        } else if (score > 80) {
            return "Grade B";
        } else if (score > 70) {
            return "Grade C";
        } else if (score > 50) {
        return "Grade D";
    } else {
            return "Grade F";
        }
    }
    public static void main(String[] args) {

        Student studGrade = new Student();
        System.out.println(studGrade.student(80));
    }
}

