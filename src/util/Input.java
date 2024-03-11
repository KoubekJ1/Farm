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
}
