package GameDesigner;

public class Abilities {
    public interface Flyable {
        void fly();
        void land();
    }
    
    public interface Swimmable {
        void swim();
        void stopSwimming();
    }
    
    public interface Teleportable {
        void teleport(int x, int y);
    }
    
}
