package class16;

public class PalindromeSolutions {
    /*
Create a method that will print whether given String is palindrome or not.

return type => void
name => isPalindrome
parameters => String inputStr
{

}
 */
    void isPalindrome(String str) {

        StringBuilder st = new StringBuilder(str);
        st.reverse();
        String reversedStr = st.toString();
        if (str.equals(reversedStr)) {
            System.out.println(str + " is palindrome");
        } else {
            System.out.println(str + " Not a palindrome");
        }
    }

    public static void main(String[] args) {

        PalindromeSolutions ps = new PalindromeSolutions();
        ps.isPalindrome("kool");
        // we can't assign void methods to variables
        // we can't use void methods in PrintLn
    }
}
