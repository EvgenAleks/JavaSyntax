package class13.homework;

public class Task_2 {
    /*
    Create a String that should be combination of letters, numbers and special characters.
    Find out how many Alphanumeric(abd AZ 284) characters are there in the String.
     */
    public static void main(String[] args) {

        String str = "James Bond 007";

        int howMany = 0;
        for (char i = 0; i < str.length(); i++) {
            if (Character.isAlphabetic(str.charAt(i))) {
                howMany++;
            } if (Character.isDigit(str.charAt(i))) {
                howMany++;
            }
        }
        System.out.print(howMany);
    }
    }



