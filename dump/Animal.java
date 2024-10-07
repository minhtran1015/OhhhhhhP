public class Animal {
    private boolean canWalk;
    private boolean canSwim;

    public Animal(boolean canWalk, boolean canSwim) {
        this.canWalk = canWalk;
        this.canSwim = canSwim;
    }

    public void displayAbilities() {
        System.out.println("Can walk: " + canWalk);
        System.out.println("Can swim: " + canSwim);
    }

    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Fish();
        animals[1] = new Duck();
        animals[2] = new Pig();
        for (Animal animal : animals) {
            animal.displayAbilities();
        }
    }
}
