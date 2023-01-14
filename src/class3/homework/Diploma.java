package class3.homework;

public class Diploma {
    public static void main(String[] args) {

        boolean diploma = false;
        double gpa = 3.8;

        if (diploma == true) {
            System.out.println("Congratulations!");
        } else if (diploma == false) {

            System.out.println("Get a degree!");

            System.out.println("Check your GPA score!");

            if (gpa >= 3.5) {
                System.out.println("GPA score: " + gpa);
                System.out.println("You are eligible for scolarship!");
            } else {
                System.out.println("GPA score: " + gpa);
                System.out.println("You should have studied harder!");
            }
        }
    }
}