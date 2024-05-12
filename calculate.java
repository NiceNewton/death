import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArithmeticCalculator {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        char choice;

        do {
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.print("Enter your choice (1-4): ");

            try {
                int operation = Integer.parseInt(reader.readLine());

                System.out.print("Enter the first number: ");
                int num1 = Integer.parseInt(reader.readLine());

                System.out.print("Enter the second number: ");
                int num2 = Integer.parseInt(reader.readLine());

                switch (operation) {
                    case 1:
                        System.out.println("Result: " + (num1 + num2));
                        break;
                    case 2:
                        System.out.println("Result: " + (num1 - num2));
                        break;
                    case 3:
                        System.out.println("Result: " + (num1 * num2));
                        break;
                    case 4:
                        if (num2 != 0) {
                            System.out.println("Result: " + (num1 / (double) num2));
                        } else {
                            System.out.println("Cannot divide by zero.");
                        }
                        break;
                    default:
                        System.out.println("Invalid choice!");
                        break;
                }
            } catch (IOException | NumberFormatException e) {
                System.out.println("Error reading input. Please enter valid numbers.");
            }

            System.out.print("Do you want to continue? (y/n): ");
            try {
                choice = reader.readLine().charAt(0);
            } catch (IOException e) {
                System.out.println("Error reading input. Exiting...");
                choice = 'n';
            }

        } while (Character.toLowerCase(choice) == 'y');
    }
}
