package class19.homework;

public class TeacherIITest {

    public static void main(String[] args) {

        TeacherII tc1 = new TeacherII();
        tc1.name = "John";
        tc1.surName = "Watson";
        tc1.teaching();
        tc1.education();
        tc1.grades();
        tc1.practice();
        System.out.println("Full Name " + tc1.name + " " + tc1.surName);

        MathTeacher tc2 = new MathTeacher();
        tc2.name = "Lewis";
        tc2.surName = "Carol";
        tc2.subject = "Math";
        tc2.teaching();
        tc2.education();
        tc2.grades();
        tc2.practice();
        tc2.interest();
        System.out.println("Full Name " + tc2.name + " " + tc2.surName
                +" Subject " + tc2.subject);

        ChemistryTeacher tc3 = new ChemistryTeacher();
        tc3.name = "Dmitry";
        tc3.surName = "Mendeleev";
        tc3.homework = "Hard work";
        tc3.teaching();
        tc3.education();
        tc3.grades();
        tc3.practice();
        tc3.formulas();
        System.out.println("Full Name " + tc3.name + " " + tc3.surName
                +" Homework " + tc3.homework);

        PianoTeacher tc4 = new PianoTeacher();
        tc4.name = "Frederic";
        tc4.surName = "Chopin";
        tc4.classic = "Classic music";
        tc4.teaching();
        tc4.education();
        tc4.grades();
        tc4.practice();
        tc4.musicSkills();
        System.out.println("Full Name " + tc4.name + " " + tc4.surName
                +" Music taste " + tc4.classic);
    }
}
