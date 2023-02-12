package class23.homework;

public class ComuterTester {
    public static void main(String[] args) {

        Computer[] specifications = {new Apple(), new Lenovo(), new HP(), new Dell()};
        for(Computer spec :specifications) {
            spec.screenSize();
            spec.hddCapacity();
            spec.rAM();
            spec.oS();

            System.out.println("-----------------------------------------------------------");
        }
    }
}
