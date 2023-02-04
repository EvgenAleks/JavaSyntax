package class17;

public class StudentTester {
    public static void main(String[] args) {

        Student student1 = new Student("John", "Medicine", 28, 8.8);
        student1.studInfo();

        Student student2 = new Student("Paul", "Law", 30, 9.0);
        student2.studInfo();

        Student student3 = new Student("George", "Art", 26, 9.2);
        student3.studInfo();
    }
}
