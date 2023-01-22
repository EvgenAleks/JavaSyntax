package class11.homework;

public class Phone {
        /*
        Create a Class “Phone”. Create 3 Objects of it:
        iPhone, Pixel, Samsung with specific  attributes and behaviors.
         */

    String name;
    String model;
    int productionYear;
    String operatingSystem;
    String color;
    void sms() {
        System.out.println(name + " " + model +
                " can send and recieve SMS");
    }
        void music() {
            System.out.println(name + " " + model +
                    " plays lossy and lossless music");
        }
    }

