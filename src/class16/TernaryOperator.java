package class16;

public class TernaryOperator {
    public static void main(String[] args) {

        int number = 0;
       /* if (3 > 2) {
            number = 10;
        } else {
            number = 20;
        }
        System.out.println(number);
*/
        number = (3 > 2) ? 10 : 20; // simple - shorter way of if else conditions
        System.out.println(number);
        number = (3 > 2) ? (4 > 5) ? 15 : 65 : 20; // nested
        System.out.println(number);
    }
}
