package class11;

public class CatTester {

    public static void main(String[] args) {
        // creating an object from the Cat class
        Cat cat1 = new Cat();
        cat1.name = "Tom";
        cat1.breed = "Bombay Cat";
        cat1.age = 2;
        cat1.color = "Black";
        cat1.attitude = false;
        cat1.eat();

        Cat cat2 = new Cat();

        cat2.name = "Murka";
        cat2.breed = "Bobtail";
        cat2.color = "White";

        System.out.println(cat2.breed);
        cat2.speak();
    }
}
