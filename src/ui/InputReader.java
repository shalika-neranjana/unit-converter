package ui;

import java.util.Scanner;

public class InputReader {

    private static final Scanner scanner = new Scanner(System.in);

    private InputReader() {
    }

    public static int readInt(String message) {

        while (true) {

            System.out.print(message);

            try {
                return Integer.parseInt(scanner.nextLine());

            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid integer.");
            }
        }
    }

    public static double readDouble(String message) {

        while (true) {

            System.out.print(message);

            try {
                return Double.parseDouble(scanner.nextLine());

            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
            }
        }
    }

    public static void pressEnterToContinue() {
        System.out.println("\nPress Enter to continue...");
        scanner.nextLine();
    }
}
