package GameDesigner;

public abstract class GameCharacter {
    private String name;
    private int level;
    private int health;

    public GameCharacter(String name, int level, int health) {
        this.name = name;
        this.level = level;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getHealth() {
        return health;
    }

    public void attack() {
        System.out.println(name + " is attacking!");
    }

    public void defend() {
        System.out.println(name + " is defending!");
    }
}
