package Omnibus;

public class Hero extends Character {
    private final String realName;

    public Hero(String name, String location, int power, Character archEnemy, String realName, Character... enemies) {
        super(name, location, power, archEnemy, enemies);
        this.realName = realName;
    }

    public Hero(String name, String location, int power, Character archEnemy, String oneLiner, String realName, Character... enemies) {
        super(name, location, power, archEnemy, oneLiner, enemies);
        this.realName = realName;
    }

    public String getRealName() {
        return realName;
    }
}
