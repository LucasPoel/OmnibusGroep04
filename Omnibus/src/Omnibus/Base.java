package Omnibus;

public class Base extends Gadget {
    private final String location;

    public Base(String name, String description, Character owner, String location) {
        super(name, description, owner);
        this.location = location;
    }

    public String getLocation() {
        return location;
    }
}
