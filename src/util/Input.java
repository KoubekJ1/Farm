package util;

import java.util.Scanner;

public abstract class Input {
    private static Scanner scanner = new Scanner(System.in);

    public static int getInt() {
        while (true) {
            try {
                return scanner.nextInt();
            } catch (NumberFormatException ignored) {

            }
        }
    }

    public static int getInt(int min, int max) {
        int value;
        while (true) {
            value = getInt();
            if (value >= min && value <= max) {
                return value;
            }
            System.out.println("Invalid answer!");
        }
    }


}
