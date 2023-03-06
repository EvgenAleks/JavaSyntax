package class30;

import java.util.HashMap;

public class MapsTask1 {
//    Create a map of a building. Store floor number and it is associated company name.
//    (Example: 1= Google, 2=Syntax etc..). Insert 7 entries with duplicate keys and values.
//    Check how many entries you have?
//    Update company on a 4th floor
//    Remove company on the 7th floor
//    Print your map

    public static void main(String[] args) {

        HashMap<Integer, String> office = new HashMap<>();
        office.put(1, "Google");
        office.put(2, "Syntax");
        office.put(7, "Meta");
        office.put(4, "Microsoft");
        office.put(5, "IBM");
        office.put(6, "Sun");
        office.put(7, "Dell");
        System.out.println(office.size());
        System.out.println(office);
        office.replace(4, "Microsoft", "HP");
        System.out.println(office);
        office.remove(7);
        System.out.println(office);
    }
}
