package class9;

public class ArraysDemo4 {
    public static void main(String[] args) {

        char[] letters = {'A', 'B', 'c', 'd', 'e', 'F' };
        letters[0] = 'M'; // replaces the first (0) char
        for (int x = 0; x < letters.length; x++) {
            System.out.println(letters[x]);
        }
    }
}
