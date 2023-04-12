package Omnibus;

public class Vehicle extends Gadget {
    private final int speed;
    private final int capacity;

    public Vehicle(String name, String description, Character owner, int speed, int capacity) {
        super(name, description, owner);
        this.speed = speed;
        this.capacity = capacity;
    }

    public int getSpeed() {
        return speed;
    }

    public int getCapacity() {
        return capacity;
    }
}
