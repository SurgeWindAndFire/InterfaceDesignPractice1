package GameDesigner;

public class TestGameCharacters {
    public static void main(String[] args) {
        // Test Case 1: Wizard Actions
        Wizard wizard = new Wizard("Gandalf", 50, 100, 200);
        wizard.castSpell();
        wizard.attack();
        wizard.fly();
        wizard.teleport(20, 40);
        wizard.land();

        // Test Case 2: Mermaid Actions
        Mermaid mermaid = new Mermaid("Ariel", 30, 80, 50);
        mermaid.sing();
        mermaid.swim();
        mermaid.defend();
        mermaid.stopSwimming();

        // Test Case 3: Superhero Actions
        Superhero superhero = new Superhero("Iron Man", 70, 120, "Super Strength");
        superhero.saveTheDay();
        superhero.attack();
        superhero.fly();
        superhero.teleport(10, 25);
        superhero.land();
        superhero.swim();
        superhero.stopSwimming();

        // Test Case 4: Polymorphism and Interface Application
        GameCharacter[] characters = {wizard, mermaid, superhero};
        for (GameCharacter character : characters) {
            character.attack();
            character.defend();

            if (character instanceof Flyable) {
                ((Flyable) character).fly();
                ((Flyable) character).land();
            }
            if (character instanceof Swimmable) {
                ((Swimmable) character).swim();
                ((Swimmable) character).stopSwimming();
            }
            if (character instanceof Teleportable) {
                ((Teleportable) character).teleport(1, 1);
            }
        }
    }
}
