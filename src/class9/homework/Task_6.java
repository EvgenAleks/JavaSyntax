package class9.homework;

public class Task_6 {
    /*
    Create an array of countries.
    While retrieving all values from an array print capital
    for each country choose any five countries.
     */
    public static void main(String[] args) {

        String[] country = {"Italy", "China", "Hungary", "Germany", "Spain"};
        String[] capital = {"Rome", "Beijing", "Budapest", "Berlin", "Madrid"};
        for (int i = 0; i < country.length; i++) {
            System.out.println(capital[i] + " is the capital of " + country[i]);
        }
    }
}
