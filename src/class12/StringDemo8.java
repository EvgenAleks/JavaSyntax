package class12;

public class StringDemo8 {
    public static void main(String[] args) {

        String str = "Java is love";
        char character = str.charAt(2);
        System.out.println(character);

        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
        int counter = 0;
        for (int j = 0; j < str.length(); j++) {
            if (str.charAt(j) == 's') {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
