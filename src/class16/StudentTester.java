package class16;

public class StudentTester {

    public static void main(String[] args) {

        Student student = new Student();
        student.name = "Zafar";
        student.id = "122";
        student.age = 24;
        student.weight = 88.2;
     //  student.schoolName = "Syntax";

        Student student1 = new Student();
        student1.name = "Hamid";
        student1.id = "482";
        student1.age = 36;
        student1.weight = 76.8;
        student1.schoolName = "Syntax";

        Student student2 = new Student();
       // student2.name = "Nelson";
        student2.id = "846";
        student2.age = 28;
        student2.weight = 77;
        // student2.schoolName = "Syntax";
        System.out.println(student2.name);
    }
}
