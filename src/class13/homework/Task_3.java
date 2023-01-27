package class13.homework;

public class Task_3 {
    /*
    You have a String a= ”Is it saturday?
    Is it raining? Do we have a Java Class today?”
    How would you find out how many sentences are in that String?
     */
    public static void main(String[] args) {

        String a = "It is saturday. Is it raining? Do we have a Java Class today?";
        String [] sent =a.split("[.?!]");
        System.out.println(sent.length);
    }
}
