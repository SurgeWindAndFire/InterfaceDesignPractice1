package GameDesigner;

public class Superhero extends GameCharacter implements Flyable, Swimmable, Teleportable {
    private String superPower;

    public Superhero(String name, int level, int health, String superPower) {
        super(name, level, health);
        this.superPower = superPower;
    }

    public void saveTheDay() {
        System.out.println(getName() + " is saving the day with " + superPower + "!");
    }

    @Override
    public void fly() {
        System.out.println(getName() + " is flying!");
    }

    @Override
    public void land() {
        System.out.println(getName() + " has landed.");
    }

    @Override
    public void swim() {
        System.out.println(getName() + " is swimming!");
    }

    @Override
    public void stopSwimming() {
        System.out.println(getName() + " has stopped swimming.");
    }

    @Override
    public void teleport(int x, int y) {
        System.out.println(getName() + " has teleported to coordinates: (" + x + ", " + y + ").");
    }
}

