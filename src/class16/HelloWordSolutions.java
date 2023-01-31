package class16;

public class HelloWordSolutions {

    String hello(String country) {

        switch (country) {
            case "USA":
                return "Hello"; // break is not needed when we use the return keyword
            case "Kazakhstan":
                return "Salem";
            case "Italy":
                return "Ciao";
            case "China":
                return "Ni hao";
            default:
                return "Country not supproted";
        }
    }

    public static void main(String[] args) {

        HelloWordSolutions hws = new HelloWordSolutions();
        System.out.println(hws.hello("China"));
    }
}
