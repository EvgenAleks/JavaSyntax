package class9.homework;

public class Task_2 {
    /*
    Create an array of names and store all names of your group.
    Then print your name from that array.
    (use 2 different ways of creating an array)
     */
    public static void main(String[] args) {

        String[] names = {"Saud", "Fizzy", "AdelS", "Batyr", "Evgenii", "Esther", "Olga", "M.asem", "Mina", "Urwa"};

        String[] names2 = new String[10];

        names2[0] = "Saud";
        names2[1] = "AdelS";
        names2[2] = "Batyr";
        names2[3] = "Evgenii";
        names2[4] = "Esther";
        names2[5] = "Fizzy";
        names2[6] = "M.asem";
        names2[7] = "Olga";
        names2[8] = "Mina";
        names2[9] = "Urwa";

        System.out.println(names[4]);
        System.out.println(names2[3]);
    }
}