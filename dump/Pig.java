public class Pig extends Animal {
    public Pig() {
        super(true, false);
    }
    @Override
    public void displayAbilities() {
        System.out.println("Pig");
        super.displayAbilities();
    }
}
