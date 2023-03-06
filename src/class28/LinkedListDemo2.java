package class28;

import java.awt.*;
import java.util.Collection;
import java.util.LinkedList;

public class LinkedListDemo2 {

    public static void main(String[] args) {

        LinkedList<String> subjects = new LinkedList<>();
        subjects.add("SDLC");
        subjects.add("Manual Testing");
        subjects.add("Jira");
        subjects.add("Git");
        subjects.add("Java");

        LinkedList<String> futureSubjects = new LinkedList<>();
        futureSubjects.add("Selenium");
        futureSubjects.add("TestNG");
        futureSubjects.add("Cucumber");
        futureSubjects.add("SQL");
        futureSubjects.add("APIs");
        futureSubjects.add("Jenkins");

        LinkedList<String> allSubjects = new LinkedList<>();

        allSubjects.addAll(subjects);
        allSubjects.addAll(futureSubjects);

//        for(String s:subjects) {
//            allSubjects.add(s);
//        }
//        for(String f:futureSubjects) {
//            allSubjects.add(f);
//        }

        System.out.println(allSubjects);

        LinkedList<String> subjectsILike = new LinkedList<>();
        subjectsILike.add("Java");
        subjectsILike.add("SDLS");
        subjectsILike.add("SQL");
        System.out.println(subjectsILike);

        allSubjects.removeAll(subjectsILike);
        System.out.println(allSubjects);


    }
}
