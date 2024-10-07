public class Fish extends Animal {
    public Fish() {
        super(false, true);
    }
    @Override
    public void displayAbilities() {
        System.out.println("Fish");
        super.displayAbilities();
    }
}
