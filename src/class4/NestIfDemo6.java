package class4;

public class NestIfDemo6 {
    public static void main(String[] args) {

        int money = 100;
        String day = "Sunday";
        boolean mood = true;

        if (money > 700) {

            if (mood) {
                System.out.println("Let's go shopping");
            }

            } else {
                System.out.println("Let's save some money first");
            }
        }
    }
