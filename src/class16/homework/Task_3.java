package class16.homework;


public class Task_3 {
    /*
    Create a method that will accept a String as a parameter and return a new String that consist only of vowels.
    Method should be available inside the class only where it was declared and executed by calling it is name.
    return type =>string
    name =>onlyV
    parameters => String str1
     */

    private String onlyV(String str2) {
        return str2.replaceAll("[^AEIOUYaeiouy]", "");
    }

    public static void main(String[] args) {

        Task_3 newString = new Task_3();
        String out = newString.onlyV("Monaco");
        System.out.println(out);
    }
}
