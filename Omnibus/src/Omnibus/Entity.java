package Omnibus;

public abstract class Entity {
    protected static int count = 0;
    protected final String name;
    protected final int id;

    public Entity(String name) {
        this.name = name;
        this.id = count++;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
