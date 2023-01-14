package class5;

public class LogicalOperators2 {
    public static void main(String[] args) {

        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && false);

        double mathScore = 89.5;
        double historyScore = 91.5;
        double scienceScore = 93.5;

        if (mathScore > 90 && historyScore >90 && scienceScore > 90){
            System.out.println("You are a brilliant student");
        } else {
            System.out.println("You need to work hard");
        }
    }
}
