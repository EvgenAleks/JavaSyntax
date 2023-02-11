package class22;

public class Degree {
    void getPrerequisite() {
        System.out.println("To get a degree you need High school diploma");
    }

}

class Bachelors extends Degree {

}

class Masters extends Degree {
    @Override
    void getPrerequisite() {
        System.out.println("To get a degree you need Bachelor degree first");
    }
}

class DegreeTester {

        public static void main(String[] args) {

            Degree degree = new Degree();
            degree.getPrerequisite();
            Bachelors bach = new Bachelors();
            bach.getPrerequisite();
            Masters mast = new Masters();
            mast.getPrerequisite();
        }
}