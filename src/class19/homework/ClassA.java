package class19.homework;

//    Write program for multilevel inheritance where class C
//   inherits from class B and Class B inherits from Class A.

public class ClassA {

    String model;
    int speed;

    public void greeting() {
        System.out.println(model + " belongs to Class A and has maximum speed " + speed + " km/h");
    }
}

class ClassB extends ClassA {

    String index;

    public void greeting2() {
        System.out.println(model + " index " + index + " belongs to Class B and has maximum speed " + speed + " km/h");
    }

}

class ClassC extends ClassB {
    int year;

    public void greeting3() {
        System.out.println(model + " index " + index + " production year " + year + " belongs to Class C and has maximum speed " + speed + " km/h");
    }
}

