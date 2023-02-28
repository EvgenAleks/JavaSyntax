package class28.homework;


import java.util.ArrayList;

public class InsuranceList {
//    Create a class Insurance that will have an attribute as insuranceName
//    and unimplemented behaviour as getQuote and cancelInsurance.
//    Create 3 subclasses Car, Pet, Health.
//    Car class has it’s own attribute as carModel and Class Pet has petType attribute.
//    Create 3 objects of the sub classes and store them in ArrayList.
//    Using for loop/advanced for loop/ iterator access all methods of the class.
//    Create a Card class that will have interest rate field and card type
//    and a constructor that will initialize the fields.
//    Create 3 objects of different card and store them into LinkedList.
//    Using for loop/advanced for loop/ iterator access all methods of the class.

    public static void main(String[] args) {
        ArrayList<Insurance> insurances = new ArrayList<>();
        insurances.add(new Car("Berkshire Hathaway", "Tesla"));
        insurances.add(new Pet("Farmers Ins Group", "Horse"));
        insurances.add(new Health("Progressive Ins Group"));

        for (Insurance i : insurances) {
            i.getQuote();
            i.cancelInsurance();
        }
    }
}

abstract class Insurance {
    String insuranceName;

    Insurance(String insuranceName) {
        this.insuranceName = insuranceName;
    }

    public abstract void getQuote();

    public abstract void cancelInsurance();
}

class Car extends Insurance {
    String carModel;

    Car(String insuranceName, String carModel) {
        super(insuranceName);
        this.carModel = carModel;
    }

    @Override
    public void getQuote() {
        System.out.println(insuranceName + " quote is 3000$ a year");
    }

    @Override
    public void cancelInsurance() {
        System.out.println("It is possible to cancel your car insurance");

    }
}


class Pet extends Insurance {
    String petType;

    Pet(String insuranceName, String petType) {
        super(insuranceName);
        this.petType = petType;
    }

    @Override
    public void getQuote() {
        System.out.println(petType + " quote is 300$ a year");
    }

    @Override
    public void cancelInsurance() {
        System.out.println("You may cancel your " + insuranceName + " insurance");

    }
}

class Health extends Insurance {

    Health(String insuranceName) {
        super(insuranceName);
    }

    @Override
    public void getQuote() {
        System.out.println("Your health insurance is 5000$ per year");
    }

    @Override
    public void cancelInsurance() {
        System.out.println("You may cancel your " + insuranceName + " insurance");

    }
}