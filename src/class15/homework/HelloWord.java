package class15.homework;

public class HelloWord {

    String hello (String country) {

        if (country.equalsIgnoreCase("Germany")) {
            return "Guten Tag!";
        } else if (country.equalsIgnoreCase("Spain")) {
            return "Hola!";
        } else if (country.equalsIgnoreCase("Sweden")) {
            return "Hej!";
        } else if (country.equalsIgnoreCase("USA")) {
            return "Hello!";
        } else if (country.equalsIgnoreCase("Russia")) {
            return "Privet!";
        } else {
            return "Wrong country.";
        }
    }
    public static void main(String[] args) {

        HelloWord hw = new HelloWord();
        System.out.println(hw.hello("russia"));
    }
}
