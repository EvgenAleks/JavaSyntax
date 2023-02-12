package class23;

public class Student77Tester {

    public static void main(String[] args) {

        Student77[] students = {new SyntaxStudent(), new CollegeStudent(), new SchoolStudent()};

        for(Student77 eachStudent:students) {
            eachStudent.study();
            eachStudent.grade();

            System.out.println("***************************************");
        }
    }
}
