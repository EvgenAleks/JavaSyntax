package class17.homework;

public class Car {

/*
Write a java class that will have a constructor:
one with parameters and second without any parameters.
Create a separate Test class where you will execute both of the constructors 1 by 1.
 */

    String manufacturer;
    String model;
    int maxSpeed;

    Car (String carManufacturer, String carModel, int carMaxSpeed) {
        manufacturer = carManufacturer;
        model = carModel;
        maxSpeed = carMaxSpeed;
    }

    Car() {

    }

    void carInfo() {
        System.out.println("Brand " + manufacturer + " Model " + model + " Maximum speed " + maxSpeed + " km/h");
    }
}
