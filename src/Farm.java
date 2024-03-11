import flowers.Flower;

import java.util.ArrayList;

public class Farm {

    private ArrayList<Flower> flowers;
    private ArrayList<Animal> animals;

    public Farm() {
        flowers = new ArrayList<>();
    }

    public void addFlower(Flower flower) {
        ArrayList<Class> flowerTypes = new ArrayList<>();
        double farmSize = 0;
        for (Flower flower1 : flowers) {
            farmSize += flower1.getNeededArea();
            if (!flowerTypes.contains(flower1.getClass())) {
                flowerTypes.add(flower1.getClass());
            }
        }
        if ((flowerTypes.size() < 5 || flowerTypes.contains(flower.getClass())) && farmSize + flower.getNeededArea() < 100) {
            flowers.add(flower);
        }
    }
}
