package ui;

public class ConsolePrinter {

    private ConsolePrinter() {
    }

    public static void printMainMenu() {

        System.out.println();
        System.out.println("==================================");
        System.out.println("         UNIT CONVERTER");
        System.out.println("==================================");
        System.out.println("1. Length");
        System.out.println("2. Weight");
        System.out.println("3. Temperature");
        System.out.println("4. Time");
        System.out.println("5. Data Storage");
        System.out.println("0. Exit");
        System.out.println("==================================");
    }
}