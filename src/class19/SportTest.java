package class19;

public class SportTest {

    public static void main(String[] args) {

        Cricket crick = new Cricket("Cricket", "Pakistan", "Green Helmet");
        crick.display();

        Soccer soc = new Soccer("Soccer", "England", "Liverlool", 11);
        soc.display();
        soc.dislayTeam();

    }
}
