package farm;

import farm.animals.Animal;
import farm.animals.Size;
import farm.flowers.Flower;

import java.util.ArrayList;

public class Farm {

    private ArrayList<Flower> flowers;
    private ArrayList<Animal> animals;

    public Farm() {
        flowers = new ArrayList<>();
        animals = new ArrayList<>();
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

    public void buyAnimal(Animal animal) {
        int smallAnimalAmount = 0;
        int bigAnimalAmount = 0;

        for (Animal animal1 : animals) {
            if (animal1.getSize() == Size.SMALL) smallAnimalAmount++;
            else bigAnimalAmount++;
        }

        if (animal.getSize() == Size.SMALL) {
            if (smallAnimalAmount >= 10) return;
        } else {
            if (bigAnimalAmount >= 10) return;
        }
        animals.add(animal);
    }

    public void sellAnimal(Animal animal) {
        animals.remove(animal);
    }

    public void sellAnimal(String name) {
        for (Animal animal : animals) {
            if (animal.getName().equals(name)) {
                sellAnimal(animal);
                break;
            }
        }
    }
}
