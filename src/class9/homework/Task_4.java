package class9.homework;

public class Task_4 {
    /*
    Create an array that can store names of cars and store 6 elements into it.
    Print all values from the array.
     */
    public static void main(String[] args) {

        String[] car = new String[6];

        car[0] = "Suzuki";
        car[1] = "Mitsubishi";
        car[2] = "Honda";
        car[3] = "Audi";
        car[4] = "Nissan";
        car[5] = "Ford";

        for (int i = 0; i < car.length; i++) {
            System.out.println(car[i] + " ");
        }
    }
}
