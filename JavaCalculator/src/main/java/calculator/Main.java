package calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);
    private static final Calculator calculator = new Calculator();
    private static final List<Calculation> history = new ArrayList<>();

    public static void main(String[] args) {

        boolean running = true;

        System.out.println("==========================");
        System.out.println("      JAVA CALCULATOR");
        System.out.println("==========================");

        while (running) {

            displayMenu();

            int choice = readInt("Choose an option: ");

            try {

                switch (choice) {

                    case 1 -> performCalculation('+');

                    case 2 -> performCalculation('-');

                    case 3 -> performCalculation('*');

                    case 4 -> performCalculation('/');

                    case 5 -> performCalculation('%');

                    case 6 -> performCalculation('^');

                    case 7 -> performSquareRoot();

                    case 8 -> displayHistory();

                    case 9 -> clearHistory();

                    case 0 -> {
                        running = false;
                        System.out.println("Goodbye!");
                    }

                    default -> System.out.println(
                            "Invalid option. Please choose from 0-9."
                    );
                }

            } catch (ArithmeticException | IllegalArgumentException e) {

                System.out.println("Error: " + e.getMessage());
            }

            System.out.println();
        }

        scanner.close();
    }

    private static void displayMenu() {

        System.out.println();
        System.out.println("--------- MENU ---------");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.println("5. Modulo (%)");
        System.out.println("6. Power (^)");
        System.out.println("7. Square Root (√)");
        System.out.println("8. View History");
        System.out.println("9. Clear History");
        System.out.println("0. Exit");
        System.out.println("------------------------");
    }

    private static void performCalculation(char operator) {

        double firstNumber = readDouble("Enter first number: ");
        double secondNumber = readDouble("Enter second number: ");

        double result = calculator.calculate(
                firstNumber,
                operator,
                secondNumber
        );

        history.add(
                new Calculation(
                        firstNumber,
                        operator,
                        secondNumber,
                        result
                )
        );

        System.out.println("Result: " + result);
    }

    private static void performSquareRoot() {

        double number = readDouble("Enter number: ");

        double result = calculator.squareRoot(number);

        System.out.println("Result: " + result);
    }

    private static void displayHistory() {

        if (history.isEmpty()) {
            System.out.println("No calculations yet.");
            return;
        }

        System.out.println();
        System.out.println("------- HISTORY -------");

        for (int i = 0; i < history.size(); i++) {

            System.out.println(
                    (i + 1) + ". " + history.get(i)
            );
        }

        System.out.println("-----------------------");
    }

    private static void clearHistory() {

        history.clear();

        System.out.println("Calculation history cleared.");
    }

    private static double readDouble(String message) {

        while (true) {

            System.out.print(message);

            if (scanner.hasNextDouble()) {
                return scanner.nextDouble();
            }

            System.out.println(
                    "Invalid input. Please enter a number."
            );

            scanner.next();
        }
    }

    private static int readInt(String message) {

        while (true) {

            System.out.print(message);

            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            }

            System.out.println(
                    "Invalid input. Please enter a number."
            );

            scanner.next();
        }
    }
}

