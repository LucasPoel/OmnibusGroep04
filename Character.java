package Omnibus;

public abstract class Character extends Entity {
    private final String location;
    private final int power;
    private final Character archEnemy;
    private final Character[] enemies;
    private String oneLiner = "You either die a hero or you live long enough to see yourself become the villain.";

    public Character(String name, String location, int power, Character archEnemy, Character... enemies) {
        super(name);
        this.location = location;
        this.power = power;
        this.archEnemy = archEnemy;
        this.enemies = enemies;
    }

    public Character(String name, String location, int power, Character archEnemy, String oneLiner, Character... enemies) {
        super(name);
        this.location = location;
        this.power = power;
        this.archEnemy = archEnemy;
        this.oneLiner = oneLiner;
        this.enemies = enemies;
    }

    public void setOneLiner(String oneLiner) {
        this.oneLiner = oneLiner;
    }

    public int getPower() {
        return power;
    }

    public String getLocation() {
        return location;
    }

    public String getOneLiner() {
        return oneLiner;
    }

    public Character getArchEnemy() {
        return archEnemy;
    }

    public Character[] getEnemies() {
        return enemies;
    }
}
