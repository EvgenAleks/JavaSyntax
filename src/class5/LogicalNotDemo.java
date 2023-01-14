package class5;

public class LogicalNotDemo {
    public static void main(String[] args) {

        String password = "124";
        System.out.println(password.equals("123"));
        if (!password.equals("123")) {
            System.out.println("Wrond password");
        } else {
            System.out.println("Right password");
        }

        boolean isRaining = true;
        if(!isRaining) {
            System.out.println("Let's go for a walk");
        } else {
            System.out.println("Let's take the umbrella");
        }
    }
}
