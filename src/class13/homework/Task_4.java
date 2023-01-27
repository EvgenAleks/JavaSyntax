package class13.homework;

public class Task_4 {
    /*
    How would you reverse a String word by word? for example
        // input=>This is sentence i want to reverse
        // output=>sihT si ecnetnes i tnaw ot esrever
     */
    public static void main(String[] args) {
        String str = "This is sentence i want to reverse";
        String words[] = str.split(" ");
        String reverseWord = "";
        for (String w : words) {
            StringBuilder sb = new StringBuilder(w);
            sb.reverse();
            reverseWord += sb + " ";
        }
        System.out.println(reverseWord + " ");
    }
}