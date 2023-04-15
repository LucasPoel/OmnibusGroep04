package Omnibus;

public class Villain extends Character {
    private final String evilPlan;
    private Hero archEnemy;
    private Hero[] enemies;

    public Villain(String name, String location, int power, String evilPlan) {
        super(name, location, power);
        this.evilPlan = evilPlan;
    }

    public Villain(String name, String location, int power, String oneLiner, String evilPlan) {
        super(name, location, power, oneLiner);
        this.evilPlan = evilPlan;
    }

    public String getEvilPlan() {
        return evilPlan;
    }

    public Hero getArchEnemy() {
        return archEnemy;
    }

    public Hero[] getEnemies() {
        return enemies;
    }

    public void setArchEnemy(Hero archEnemy) {
        this.archEnemy = archEnemy;
    }

    public void setEnemies(Hero[] enemies) {
        this.enemies = enemies;
    }
}
