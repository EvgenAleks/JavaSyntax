package class17;

public class DogTester {

    public static void main(String[] args) {

        Dog husky = new Dog("Dazy", "Husky", 8, 16.2);
        husky.printInfo();

        Dog terrier = new Dog("Mick", "Terrier", 6, 9.2);
        terrier.printInfo();

        Dog shepherdDog = new Dog("Yan", "Shepherd Dog", 4, 38.6);
        shepherdDog.printInfo();

        Dog spaniel = new Dog("Rick", "Spaniel", 2, 14.1);
        spaniel.printInfo();

    }
}
