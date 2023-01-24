package class12;

public class GuitarTest {
    public static void main(String[] args) {

        Guitar fender = new Guitar();

        fender.maker = "Fender";
        fender.model = "Telecaster";
        fender.numberOfStrings = 6;
        fender.sound();
    }
}
