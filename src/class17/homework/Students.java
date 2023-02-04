package class17.homework;

public class Students {
    /*
    Write a java Class Students that have a constructor which takes students name and 3 subject grades.
    Inside your class also have a method to Calculate Average Grade.
    Test Student class for 5 different students with different marks.
    Your program should print an average mark of each student's name.
NOTE: please use different names for instance and local variables.
     */

    String name;
    double mathGrade;
    double historyGrade;
    double chemistryGrade;
    double averageGrade;

    Students(String sName, double sMathGrade, double sHistoryGrade, double sChemistrygrade) {
        name = sName;
        mathGrade = sMathGrade;
        historyGrade = sHistoryGrade;
        chemistryGrade = sChemistrygrade;
    }
        double getAvGrade () {
            averageGrade = ((mathGrade + historyGrade + chemistryGrade) / 3);
            return averageGrade;
        }


        void studentsInfo () {
            System.out.println("Student " + name + " has the average grade " + averageGrade);
        }
    }



