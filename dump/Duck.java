public class Duck extends Animal {
    public Duck() {
        super(true, true);
    }
    @Override
    public void displayAbilities() {
        System.out.println("Duck");
        super.displayAbilities();
    }
}
