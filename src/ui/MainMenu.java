package ui;

public class MainMenu {

    public void start() {
        while (true) {

            ConsolePrinter.printMainMenu();

            int choice = InputReader.readInt("Enter your choice: ");

            switch (choice) {
                case 1:
                    System.out.println("Length Converter");
                    break;

                case 2:
                    System.out.println("Weight Converter");
                    break;

                case 3:
                    System.out.println("Temperature Converter");
                    break;

                case 4:
                    System.out.println("Time Converter");
                    break;

                case 5:
                    System.out.println("Data Storage Converter");
                    break;

                case 0:
                    System.out.println("Goodbye!");
                    return;

                default:
                    System.out.println("Invalid choice.");
            }

            InputReader.pressEnterToContinue();
        }
    }
}
