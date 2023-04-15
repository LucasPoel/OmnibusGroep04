package Omnibus;

public abstract class Character extends Entity {
    protected final String location;
    protected final int power;
    protected String oneLiner = "You either die a hero or you live long enough to see yourself become the villain.";

    public Character(String name, String location, int power) {
        super(name);
        this.location = location;
        this.power = power;
    }

    public Character(String name, String location, int power, String oneLiner) {
        super(name);
        this.location = location;
        this.power = power;
        this.oneLiner = oneLiner;
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
}
