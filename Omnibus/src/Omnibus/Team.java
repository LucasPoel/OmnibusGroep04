package Omnibus;

public class Team {

    private final Character[] members;

    public Team(Character... members) {
        this.members = members;
    }

    public Character[] getMembers() {
        return members;
    }
}
