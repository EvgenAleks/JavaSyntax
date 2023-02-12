package class23.homework;

public class Computer {
//    Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
//    Define common behavior within and some fields
//    in parent class
//    and override some of the methods in child classes
//    Define some methods specific to child classes
//    Create objects of child classes and store them into array.
//    Loop through each object and execute available methods.

public void screenSize() {
    System.out.println("Screen size unknown");
}
public void hddCapacity() {
    System.out.println("HDD unknown");
}
public void rAM() {
    System.out.println("RAM unknown");
}
public void oS() {
    System.out.println("OS unknown");
}
}
class Apple extends Computer {

    @Override
    public void hddCapacity() {
        System.out.println("Apple has 512 Gb SSD");
    }

    @Override
    public void oS() {
        System.out.println("Apple has Mac OS installed");
    }
}
class Lenovo extends Computer {
    @Override
    public void screenSize() {
        System.out.println("Lenovo screen size is 15.6 inches");
    }

    @Override
    public void oS() {
        System.out.println("Lenovo has Windows 11 OS installed");
    }
}
class HP extends Computer {

    @Override
    public void rAM() {
        System.out.println("HP computer has 8 Gb RAM");
    }

    @Override
    public void oS() {
        System.out.println("HP has Windows 10 OS installed");
    }
}
class Dell extends Computer {
    @Override
    public void screenSize() {
        System.out.println("Dell computer screen size is 17.3 inches");
    }

    @Override
    public void hddCapacity() {
        System.out.println("Dell computer has 1 Tb SSD");
    }

    @Override
    public void rAM() {
        System.out.println("Dell computer has 16 Gb RAM");
    }
}