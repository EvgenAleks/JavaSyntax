package class19;

public class Sport {

    String name;

    String country;

    Sport(String name, String country) {

        this.name = name;
        this.country = country;
    }

    public void display() {
        System.out.println(name + " is palyed in " + country);
    }
}

class Cricket extends Sport {

    String helmet;

    Cricket(String name, String country, String helmet) {
        super(name, country); // makes a call to the immediate super class constructor
        // super() - ALWAYS must be in the first line
        this.helmet = helmet;
    }
}

class Soccer extends Sport {

    String team;
    int numberOfPlayers;

    Soccer(String name, String country, String team, int numberOfPlayers) {
        super(name, country);
        this.team = team;
        this.numberOfPlayers = numberOfPlayers;

    }
        void dislayTeam() {
        System.out.println(team + " consists of " + numberOfPlayers + " players");
    }
}