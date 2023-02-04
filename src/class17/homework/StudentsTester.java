package class17.homework;

public class StudentsTester {

    public static void main(String[] args) {

        Students studentOne = new Students("Robert", 6.4, 8.2, 8.6);
        studentOne.getAvGrade();
        studentOne.studentsInfo();

        Students studentTwo = new Students("Jimmy", 7.4, 5.2, 6.6);
        studentTwo.getAvGrade();
        studentTwo.studentsInfo();

        Students studentThree = new Students("John", 8.8, 8.2, 9.6);
        studentThree.getAvGrade();
        studentThree.studentsInfo();

        Students studentFour = new Students("Peter", 9.4, 9.2, 9.6);
        studentFour.getAvGrade();
        studentFour.studentsInfo();

        Students studentFive = new Students("Mick", 4.1, 4.4, 3.2);
        studentFive.getAvGrade();
        studentFive.studentsInfo();
    }
}
