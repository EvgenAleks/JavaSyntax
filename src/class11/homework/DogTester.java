package class11.homework;

public class DogTester {
    /*
    Create a Dog Class and create 3 different objects of it:
    Husky, Bulldog, Labrador  with specific  attributes and behaviors.
     */
    public static void main(String[] args) {

        Dog husky = new Dog();
        husky.name = "Sunny";
        husky.breed = "Husky";
        husky.age = 4;
        husky.weight = 14.3;
        husky.bark();
        husky.howl();

        Dog bulldog = new Dog();
        bulldog.name = "Butch";
        bulldog.breed = "Bulldog";
        bulldog.age = 8;
        bulldog.weight = 24.2;
        bulldog.bark();
        bulldog.howl();

        Dog labrador = new Dog();
        labrador.name = "Mike";
        labrador.breed = "Labrador";
        labrador.age = 5;
        labrador.weight = 22.8;
        labrador.bark();
        labrador.howl();
    }
}
