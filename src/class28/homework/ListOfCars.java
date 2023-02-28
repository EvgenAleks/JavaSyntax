package class28.homework;

import java.util.ArrayList;

public class ListOfCars {
//   Create an arraylist of cars and retrieve all the values using 3 different ways.

    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<>();
        cars.add("Audi");
        cars.add("Suzuki");
        cars.add("Mazda");
        cars.add("Honda");
        cars.add("KIA");

        System.out.println(cars);

        for (String c : cars
        ) {
            System.out.print(c + ", ");
        }

        System.out.println();

        for (int i = 0; i < cars.size(); i++) {
            String car = cars.get(i);
            System.out.print(car + ", ");
        }
    }
}
