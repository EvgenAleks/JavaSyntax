package projectOne;

public class Task_11 {
    /*
    Write a program to print out duplicate elements from an Array of Strings.
     */
    public static void main(String[] args) {

        String[] car = {"Suzuki", "KIA", "Ford", "BMW", "Fiat", "Suzuki", "KIA"};
        for (int i = 0; i < car.length; i++) {
            for (int j = i + 1; j < car.length; j++) {
                if (car[i].equals(car[j])) {
                    System.out.println(car[i]);
                }
            }
        }
    }
}

