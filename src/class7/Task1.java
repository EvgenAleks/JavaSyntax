package class7;

public class Task1 {
    public static void main(String[] args) {

        boolean workDay = true;
        int day = 1;

        while (workDay) {
            if (day <= 5) {
                System.out.println("I need a day off");
            } else {
                System.out.println("I don't need a day off anymore");
                workDay = false;
            }
            day++; // day +=1 or day = day+1
        }
    }
}
