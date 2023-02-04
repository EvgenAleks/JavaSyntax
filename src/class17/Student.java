package class17;

public class Student {

      /*
        Create a class call it Student define 4 instance fields like id Name age weight
        create 5 objects of this class do this task without constructors and with constructors
         */

    String name;
    String faculty;
    int age;
    double averageScore;

    Student(String studName, String studFaculty, int studAge, double studScore) {
        name = studName;
        faculty = studFaculty;
        age = studAge;
        averageScore = studScore;

    }
    void studInfo() {
        System.out.println("Name " + name + " Faculty " + faculty + " Age " + age + " Average score " + averageScore);

    }
}