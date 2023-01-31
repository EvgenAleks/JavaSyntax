package class16;

public class Person {

    private double bankBalance = 124000;

    String address = "Street 104"; // default access level is applied

 public String name = "Harry Potter";

 private void printPhonePassword() {
     System.out.println("passwordXXX");
 }

 void printSSN() {
     System.out.println("22299944");
 }

 public void printTikTokAccount() {
     System.out.println("user7765");
 }

    public static void main(String[] args) {

        Person person = new Person();
        System.out.println(person.bankBalance);
        System.out.println(person.address);
        System.out.println(person.name);
        person.printTikTokAccount();
        person.printSSN();
        person.printPhonePassword();
    }
}
