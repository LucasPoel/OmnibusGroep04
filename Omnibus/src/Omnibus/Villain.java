package Omnibus;

public class Villain extends Character {
    private final String evilPlan;

    public Villain(String name, String location, int power, Character archEnemy, String evilPlan, Character... enemies) {
        super(name, location, power, archEnemy, enemies);
        this.evilPlan = evilPlan;
    }

    public Villain(String name, String location, int power, Character archEnemy, String oneLiner, String evilPlan, Character... enemies) {
        super(name, location, power, archEnemy, oneLiner, enemies);
        this.evilPlan = evilPlan;
    }

    public String getEvilPlan() {
        return evilPlan;
    }
}
