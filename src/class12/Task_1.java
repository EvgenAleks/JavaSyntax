package class12;

import java.util.Scanner;

public class Task_1 {

    public static void main(String[] args) {
        /*
        Store username, password and confirm password from a user and check following requirements:
Username and Password cannot be  empty, if so→ message=”Username and Password cannot be empty”.
Password should be minimum 8 characters, if less → message=”Password is too short”.
Password cannot contain username if so, → message=”Password cannot contain username”.
Password should match confirmed password, if not  → message=“Passwords do not match”.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter username");
        String name = scan.nextLine();
        System.out.println("Please enter password");
        String pass = scan.nextLine();
        System.out.println("Please confirm password");
        String passConfirm = scan.nextLine();

        if (name.isEmpty() || pass.isEmpty()) {
            System.out.println("Username and password can not be empty");
        } else if (pass.length() < 8) {
            System.out.println("Password is too short");
        } else if (pass.contains(name)) {
            System.out.println("Password can not contain username");
        } else if (!pass.equals(passConfirm)) {
            System.out.println("Passwords do not match");
        } else {
            System.out.println("Your username and password have been created");
        }
    }
}
