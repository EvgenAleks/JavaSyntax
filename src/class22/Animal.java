package class22;

public class Animal {

    String name;
    String color;
    int age;
    double weight;
    void speak() {
        System.out.println("Animals can speak");
    }

    void eat() {
        System.out.println("All the animals eat");
    }
}

class Cat extends Animal {
    // we are overriding speak mathod in Cat class
    void speak() {
        super.speak();
        System.out.println("Meow meow!");
    }
    void printName() {
        System.out.println(name);
    }
}
    class Dog extends Animal {

    }

    class Tester {
        public static void main(String[] args) {
            Cat cat = new Cat();
            cat.speak();
        }
    }
