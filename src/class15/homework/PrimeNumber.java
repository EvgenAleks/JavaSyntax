package class15.homework;

public class PrimeNumber {
    /*
    Write a method to return whether given number is prime or not?
     */
    boolean prNum(int num1) {
        boolean prime = true;
        if (num1 > 1) ;
        for (int i = 2; i <= num1 / 2; ++i) {
            if (num1 % i == 0) {
                return false;
            } else {

            }
        }
        return prime;
    }

    public static void main(String[] args) {
        PrimeNumber pn1 = new PrimeNumber();
        System.out.println(pn1.prNum(5));
    }
}


