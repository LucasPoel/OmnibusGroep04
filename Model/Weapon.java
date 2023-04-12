package Omnibus;

public class Weapon extends Gadget {
    private final int power;

    public Weapon(String name, String description, Character owner, int power) {
        super(name, description, owner);
        this.power = power;
    }

    public int getPower() {
        return power;
    }
}
