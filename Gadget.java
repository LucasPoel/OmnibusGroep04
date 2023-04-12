package Omnibus;

public abstract class Gadget extends Entity {
    private final String description;
    private final Character owner;

    public Gadget(String name, String description, Character owner) {
        super(name);
        this.description = description;
        this.owner = owner;
    }

    public String getDescription() {
        return description;
    }

    public Character getOwner() {
        return owner;
    }
}
