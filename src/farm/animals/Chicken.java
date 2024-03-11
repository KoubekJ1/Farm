package farm.animals;

public class Chicken extends Animal {

    public Chicken(String name) {
        super("Bird", name, Size.SMALL, "Brush regularly");
    }

    @Override
    public void pet() {
        System.out.println("Pi pi");
    }
}
