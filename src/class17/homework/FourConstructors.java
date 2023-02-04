package class17.homework;

public class FourConstructors {
    /*
    Write a java class that have 4 constructors with 4 different access levels of constructors
    (private,public,default,protected) and create 4 objects of this class:
    1 - inside same class; 2 - from outside the class;
    3 - from different class inside different package  and observe result.
     */

    private FourConstructors() {
        System.out.println("Constructor without any parameters");
    }

    FourConstructors(String name) {
        System.out.println("Constructor with a String parameter");
    }

    protected FourConstructors(int number) {
        System.out.println("Constructor with an int parameter");
    }

    public FourConstructors(char c) {
        System.out.println("Constructor with a char parameter");
    }

    public static void main(String[] args) {

        FourConstructors fp1 = new FourConstructors();
        FourConstructors fp2 = new FourConstructors("Java");
        FourConstructors fp3 = new FourConstructors(1000);
        FourConstructors fp4 = new FourConstructors('G');
    }
}
