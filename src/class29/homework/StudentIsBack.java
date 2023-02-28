package class29.homework;

import java.util.HashSet;

public class StudentIsBack {
//    Create a Set collection that will hold Objects of Student Type.
//    In this set we do not care about the insertion order.
//    Each student object should have name and studentID. Display name of each student.

    public static void main(String[] args) {

        HashSet<Student> students = new HashSet<>();
    }
}
class Student {

    private String name;
    private int StudentID;

    public Student(String name, int studentID) {
        this.name = name;
        StudentID = studentID;
    }

    public String getName() {
        return name;
    }
}
