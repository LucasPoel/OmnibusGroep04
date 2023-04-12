package Omnibus;

public abstract class Entity {
    private static int count = 0;
    private final String name;
    private final int id;

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
