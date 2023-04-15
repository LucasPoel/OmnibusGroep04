package Omnibus;

public class Team {

    private final Character[] members;

    public Team(Hero... members) {
        this.members = members;
    }

    public Team(Villain... members) {
        this.members = members;
    }

    public Character[] getMembers() {
        return members;
    }
}
