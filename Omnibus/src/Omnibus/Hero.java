package Omnibus;

public class Hero extends Character {
    private final String realName;
    private Villain archEnemy;
    private Villain[] enemies;

    public Hero(String name, String location, int power, String realName) {
        super(name, location, power);
        this.realName = realName;
    }

    public Hero(String name, String location, int power, String oneLiner, String realName) {
        super(name, location, power, oneLiner);
        this.realName = realName;
    }

    public String getRealName() {
        return realName;
    }

    public void setArchEnemy(Villain archEnemy) {
        this.archEnemy = archEnemy;
    }

    public Villain getArchEnemy() {
        return archEnemy;
    }

    public void setEnemies(Villain[] enemies) {
        this.enemies = enemies;
    }

    public Villain[] getEnemies() {
        return enemies;
    }
}
