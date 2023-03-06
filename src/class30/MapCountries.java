package class30;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapCountries {

    public static void main(String[] args) {

        Map<String, String> coca = new TreeMap<>();
        coca.put("UK", "London");
        coca.put("Spain", "Madrid");
        coca.put("Japan", "Tokio");
        coca.put("France", "Paris");

       // Set<Map.Entry<String, String>> entrySet = coca.entrySet();
        var entrySet = coca.entrySet();
        for(var entry:entrySet) {
            System.out.println(entry.getKey() + " " + entry.getValue());

            var iterator = coca.entrySet().iterator();

            while (iterator.hasNext()) {

                entry = iterator.next();
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }
    }
}
