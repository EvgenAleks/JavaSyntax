package class30.homework;

import java.util.Map;
import java.util.TreeMap;

public class Person {
//    Create a Person class with following private fields: name, lastName, age, salary.
//    Variables should be initialized through constructor.
//    Inside the class also create a method to print user details.
//    In Test Class create a Map that will store key in ascending order.
//    In that map store personId and a Person Object. Print each object details.

    String name;
    String lastName;
    int age;
    double salary;

    public Person(String name, String lastName, int agr, double salary) {
        this.name = name;
        this.lastName = lastName;
        this.age = agr;
        this.salary = salary;
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Last Name: " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}

class PersonTester {

    public static void main(String[] args) {

        Person p1 = new Person("Mick", "Jagger", 79, 1500000.00);
        Person p2 = new Person("Keith", "Richards", 79, 1200000.00);
        Person p3 = new Person("Ron", "Wood", 75, 100000.00);

        Map<Integer, Person> personMap = new TreeMap<>();
        personMap.put(1, p1);
        personMap.put(2, p2);
        personMap.put(3, p3);

        for (Map.Entry<Integer, Person> entry : personMap.entrySet()) {
            System.out.println("Person ID: " + entry.getKey());
            entry.getValue().printInfo();
            System.out.println();

        }
    }
}
