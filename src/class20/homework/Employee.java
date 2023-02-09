package class20.homework;

public class Employee {
    /*
    Create an Employee class that will have variables and methods.
    Constructor that should initialize instance variables
    Create 2 subclasses FullTime and PartTime Employees that should have own variables and methods.
    Create a Tester Subclass from FullTime Employee and add some features and methods to the Tester Class.
    Test your code!
    */

    String name;
    int age;
    String department;

    Employee(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    void empInfo() {
        System.out.println("Name: " + name + " Age: " + age + " Department: " + department);
    }
}
class FullTimeEmployee extends Employee {
    int experience;

    FullTimeEmployee(String name, int age, String department, int experience) {
        super(name, age, department);
        this.experience = experience;
    }

    void ftEmpInfo() {
        System.out.println("Name: " + name + " Age: " + age + " Department: " + department
                + " Experience in years: " + experience);
    }
}
    class Tester extends FullTimeEmployee {
        String qA;

        Tester(String name, int age, String department, int experience, String qA) {
            super(name, age, department, experience);
            this.qA = qA;
        }

        void testerInfo() {
            System.out.println("Name: " + name + " Age: " + age + " Department: " + department
                    + " Experience in years: " + experience + " Position " + qA);
        }
    }

    class PartTimeEmployee extends Employee {
        String weekdays;

        PartTimeEmployee(String name, int age, String department, String weekdays) {
            super(name, age, department);
            this.weekdays = weekdays;
        }
            void partTimeInfo() {
                System.out.println("Name: " + name + " Age: " + age + " Department: "
                        + department + " Works on: " + weekdays);
            }
        }


