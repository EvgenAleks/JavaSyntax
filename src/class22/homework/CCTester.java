package class22.homework;

public class CCTester {

    public static void main(String[] args) {

        CreditCard cc1 = new CreditCard();
        System.out.println(cc1.calc(1000.0, 3.5));

        Visa visa = new Visa();
        System.out.println(visa.calc(1000, 4.5));

        AX aX = new AX();
        System.out.println(aX.calc(1000, 5.5));
    }
}
