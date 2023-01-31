package class16;

public class Students {
    /*
    Create a Class called Students
Create three  variables  Name , ID  and  numberOfStudents
Create three objects of the Students Class
Set the value for  studentName , studentID and increment  the numberOfStudents for each object
Print out  total number of students.
     */

    String name;
    String id;
    static int numberOfStudents;

    public static void main(String[] args) {

        Students st1 = new Students();
        st1.name = "Harry";
        st1.id = "1A";
        st1.numberOfStudents++;
        System.out.println(st1.name + " " + st1.id + " " + st1.numberOfStudents);

        Students st2 = new Students();
        st2.name = "Ron";
        st2.id = "1B";
        st2.numberOfStudents++;
        System.out.println(st2.name + " " + st2.id + " " + st2.numberOfStudents);

        Students st3 = new Students();
        st3.name = "Hermione";
        st3.id = "1C";
        st3.numberOfStudents++;
        System.out.println(st3.name + " " + st3.id + " " + st3.numberOfStudents);
        System.out.println("Students total number " + numberOfStudents);
    }
}

