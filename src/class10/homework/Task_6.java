package class10.homework;

public class Task_6 {

    /*
    Create 2D array of countries: north america countries,
    south america countries, europe countries, asian countries,
    african countries.
    Then print all values from that array using 2 different loops
    and calculate how many total countries been stored.
           */
    public static void main(String[] args) {

        String [][] countries = {{"USA", "Canada", "Cuba"},
                {"Brazil", "Peru", "Argentina"},
                {"Spain", "France", "Italy", "Poland", "Sweden"},
                {"China", "India", "Korea"},
                {"Morocco", "Nigeria", "Egypt", "Sputh Africa"}
        };
        System.out.println(countries[2].length);

        int arr = 0;
        /*
        for (int i = 0; i < countries.length; i++) {
            for (int j = 0; j < countries[i].length; j++ ) {
                System.out.print(countries[i][j] + " ");
                arr++;
            }
            System.out.println();

         */


        System.out.println("**********************************");
        for (String[] country : countries) {
            for (String x : country) {
                System.out.print(x + " ");
                arr++;
            }
            System.out.println();
        }
        System.out.println("Total " + arr + " countries");
    }
}
