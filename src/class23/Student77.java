package class23;

public class Student77 {
//    Create a Class Student that will have 3 subclasses as
//    SyntaxStudent, CollegeStudent, SchoolStudent.
//    Define common behavior within parent class and
//    override some of the methods in child classes
//    Define some methods specific to child classes
//    Write example of achieving run time polymorphism
    public void study() {
        System.out.println("Student gets education");
    }
    public void grade() {
        System.out.println("Student has different grades");
    }
}

class SyntaxStudent extends Student77 {
    @Override
    public void study() {
        System.out.println("Syntax students work hard");
    }

    @Override
    public void grade() {
        System.out.println("Syntax Students get different grades");
    }
}
class CollegeStudent extends Student77 {

    @Override
    public void study() {
        System.out.println("College students do lot of practice");
    }

    }

    class SchoolStudent extends Student77 {

    }


