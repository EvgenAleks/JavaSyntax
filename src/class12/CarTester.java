package class12;

public class CarTester {
    public static void main(String[] args) {
        // Create object of the class
        Car honda = new Car();
        honda.make = "Honda";
        honda.model = "Jazz";
        honda.year = 2022;
        honda.color = "blue";
        honda.moveForward();
        honda.applyBrakes();
    }
}
