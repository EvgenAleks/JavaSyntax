package class30;

import java.util.HashMap;
import java.util.Map;

public class MapsDemo1 {

    public static void main(String[] args) {

        Map<Integer, String> studentsMap = new HashMap<>();

        studentsMap.put(1, "Nezir");
        studentsMap.put(2, "Shah");
        studentsMap.put(3, "Tami F");
        studentsMap.put(4, "Aisha");

        System.out.println(studentsMap);
        System.out.println(studentsMap.get(3));
        System.out.println(studentsMap.size());
        System.out.println(studentsMap.containsKey(5));
        System.out.println(studentsMap.containsValue("Aisha"));
        System.out.println(studentsMap.remove(2));
        System.out.println(studentsMap);
        System.out.println(studentsMap.replace(1,"Asli"));
        System.out.println(studentsMap);
    }
}
