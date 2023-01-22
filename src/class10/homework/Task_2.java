package class10.homework;

import java.util.Arrays;

public class Task_2 {

    /*
    Create 2D array of cars : american, german, korean, italian.
    Then retrieve all values from that array using 2 different loops
     */
    public static void main(String[] args) {

        String[][] cars = new String[4][4];
        String[] american = {"Ford", "Buick", "GMC", "Tesla"};
        String[] german = {"Audi", "Mercedes", "BMW", "Volkswagen", "Opel"};
        String[] korean = {"KIA", "Hyundai", "SsangYong", "Samsung"};
        String[] italian = {"Ferrari", "Alfa Romeo", "Fiat", "Maserati"};

        cars[0] = american;
        cars[1] = german;
        cars[2] = korean;
        cars[3] = italian;


        for (int i = 0; i < cars.length; i++) {
            for (int j = 0; j < cars[i].length; j++) {
                System.out.print(cars[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("****************************************************");

        for  (String[] array: cars) {
            for (String makers: array) {

                System.out.print(makers + " ");
            }
            System.out.println();
        }
    }
}

