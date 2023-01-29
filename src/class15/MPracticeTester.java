package class15;

public class MPracticeTester {

    public static void main(String[] args) {
        /*
        create the object of the class that has the method
        objectname. methodname
         */

        MPractice3 mp3 = new MPractice3();
        int[] array = {10, 20, 30};
        System.out.println(mp3.arrSum(array));

        System.out.println(mp3.arrSum(new int[]{10, 10, 10}));
    }
}

