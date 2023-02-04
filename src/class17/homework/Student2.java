package class17.homework;

public class Student2 {
    /*
    Write a Student class that have instance variables name and address.
    Create a constructor that will initialize those variables.
    Print name & address of given  student using displayInfo method.
     */

    String name;
    String address;

    Student2(String newName, String newAddress) {
        name = newName;
        address = newAddress;
    }
    void displayInfo () {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
    }

}
