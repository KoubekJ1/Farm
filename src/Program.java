import util.Input;

public class Program {

    private static int answer;

    public static void runProgram() {
        System.out.println("Welcome!");
        answer = Input.question(new String[]{"Manage flowers", "Manage animals"});
        switch (answer) {
            case 1 -> manageFlowers();
            case 2 -> manageAnimals();
        }
    }

    public static void manageFlowers() {

    }

    public static void manageAnimals() {

    }
}
