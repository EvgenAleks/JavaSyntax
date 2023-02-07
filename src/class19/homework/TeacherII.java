package class19.homework;
/*      Write a Java program called Teacher.
        Identify features and 4 behaviour of that Class.
        Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher
        that would have it their own features and behaviour.
        Test all 4 classes.
*/
public class TeacherII {

    String name;
    String surName;

    public void teaching() {
        System.out.println("Good at teaching.");
    }

    protected void education() {
        System.out.println("Well educated.");
    }

    void grades() {
        System.out.println("Depends on student.");
    }

    void practice() {
        System.out.println("Lots of practice.");
    }
}

class MathTeacher extends TeacherII {
    String subject;
    void interest() {
        System.out.println("Very exiting!");
    }
}
class ChemistryTeacher extends TeacherII {
    String homework;
    void formulas() {
        System.out.println("Gives different formulas.");
    }
}

class PianoTeacher extends TeacherII {
    String classic;
        void musicSkills() {
        System.out.println("Plays piano and guitar.");
    }
}

