package class15.homework;

public class Palindrome {
/*
Create a method that will print whether given String is palindrome or not.

return type => void
name => isPalindrome
parameters => String inputStr
{

}
 */
    String palDrome(String word) {
        String reverse = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reverse = reverse + word.charAt(i);
        }
        if (word.equalsIgnoreCase(reverse)) {
            return "A palindrome!";

        } else {
            return "Not a palindrome!";
        }
    }

    public static void main(String[] args) {

        Palindrome pd1 = new Palindrome();
        System.out.println(pd1.palDrome("MadamImAdam"));
    }
}

