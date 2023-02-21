package projectTwo;

//        Create a Class Car that would have the
//        following fields: carPrice and color and method
//        calculateSalePrice() which should be returning
//        a price of the car.
//        Create 2 subclasses: Sedan and Truck. The Truck
//        class has a field as weight and has its own
//        implementation of calculateSalePrice() method
//        in which returned price is calculated as
//        following: if weight>2000 then returned price
//        car should include 10% discount, otherwise 20%
//        discount.
//        The Sedan class has field as length and also
//        does it is own implementation of
//        calculateSalePrice(): if length of sedan is >20
//        feet then returned car price should include 5%
//        discount, otherwise 10% discount
//


public class SedanAndTruck {

    public static void main(String[] args) {

        Truck tr = new Truck(100000, "black", 1900);
        System.out.println("Sale Price of the " + tr.color + " truck is " + tr.calculateSalePrice());

Sedan se = new Sedan(10000, "red", 19.8);
        System.out.println("Sale Price of the " + se.color + " sedan is "+ se.calculateSalePrice());
    }

}

abstract class Car {

    double carPrice;
    String color;

   Car(double carPrice, String color) {
        this.carPrice = carPrice;
        this.color = color;
    }

    abstract double calculateSalePrice();
}

class Truck extends Car {

    double weight;

    public Truck(double carPrice, String color, double weight) {
        super(carPrice, color);
        this.weight = weight;
    }

    @Override
    double calculateSalePrice() {
        if (weight > 2000) {
            carPrice = carPrice * 0.9;
            return carPrice;
        } else {
            carPrice = carPrice * 0.8;
            return carPrice;
        }
    }
}
class Sedan extends Car {

    double length;

    public Sedan(double carPrice, String color, double length) {
        super(carPrice, color);
        this.length = length;
    }

    @Override
    double calculateSalePrice() {
        if(length > 20) {
            carPrice = carPrice*0.95;
            return carPrice;
        } else {
            carPrice = carPrice*0.9;
            return carPrice;
        }
    }
}

