package class16.homework;

public class Task_2 {
    /*
    Create a method that will take a String as a parameter and returns reversed String.
    Method should be available to all classes within your project and accessible by class name.
     */
    public String rev1(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        String rev1 = sb.toString();
        return rev1;
    }

    public static void main(String[] args) {
        Task_2 rev2 = new Task_2();
        System.out.println(rev2.rev1("RocknRoll"));
    }
}
