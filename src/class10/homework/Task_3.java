package class10.homework;

public class Task_3 {

    public static void main(String[] args) {

        /*
        Using 2D array create a grocery list.
Inside you should have an array of veggies, fruits, dairy and sweets.
Retrieve all values from that array using 2 different loops.
         */

        String[][] food = new String[4][3];
        String[] veggies = {"Tomato", "Carrot", "Cucumber"};
        String[] fruits = {"Apple", "Orange", "Banana"};
        String[] dairy = {"Milk", "Cheese", "Butter"};
        String[] sweets = {"Cake", "Lollipop", "Chocolate"};

        food[0] = veggies;
        food[1] = fruits;
        food[2] = dairy;
        food[3] = sweets;

        for (int i = 0; i < food.length; i++) {
            for (int j = 0; j < food[i].length; j++) {

                System.out.print(food[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("*********************************************");

        for (String [] arr : food) {
            for (String grocery : arr) {
                System.out.print(grocery + " ");
            }
            System.out.println();
        }
    }
}
