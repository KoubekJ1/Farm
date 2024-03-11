import java.util.ArrayList;

public class Farm {

    private ArrayList<Flower> flowers;

    public Farm() {
        flowers = new ArrayList<>();
    }

    public void addFlower(Flower flower) {
        ArrayList<FlowerType> flowerTypes = new ArrayList<>();
        for (Flower flower1 : flowers) {
            if (!flowerTypes.contains(flower1.getType())) {
                flowerTypes.add(flower1.getType());
            }
        }
        if (flowerTypes.size() < 5 || flowerTypes.contains(flower.getType())) {
            flowers.add(flower);
        }
    }
}
