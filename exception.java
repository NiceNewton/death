//wap which will accept the value of two integer variable x and y.divide x by y and check the result if denominator is 0 handle the necessary exception
import java.util.Scanner;

public class exception{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number (numerator): ");
        int x = scanner.nextInt();

        System.out.print("Enter the second number (denominator): ");
        int y = scanner.nextInt();

        try {
            double result = (double) x / y; 
            System.out.println("The result of the division is: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } 
    }
}
