package farm.animals;

public class Pig extends Animal {

    public Pig(String name) {
        super("Mammal", name, Size.BIG, "Bath regularly");
    }

    @Override
    public void pet() {
        System.out.println("Chro chro");
    }
}
