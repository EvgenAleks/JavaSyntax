package class13;

public class StringRecap {
    public static void main(String[] args) {

        String str = "Java is great";
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.toUpperCase().charAt(i) + "  ");
        }
        System.out.println();
        // what is the input to the charAt() method its int out is a char
        // count how many times the letter a has appeared in the above String
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a') {
                count++;
            }
        }
        System.out.println("Letter a has appeared " + count + " times");
    }
}


