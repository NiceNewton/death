import java.util.Scanner;

class CheckArgument extends Exception {
    public CheckArgument(String message) {
        super(message);
    }
}

public class SquareAddition {
    public static void main(String[] args) {
        int numArgs = args.length;

        try {
            if (numArgs < 4) {
                throw new CheckArgument("Insufficient arguments provided. Please enter four numbers.");
            }

            int sumOfSquares = 0;
            for (int i = 0; i < 4; i++) {
                sumOfSquares += Integer.parseInt(args[i]) * Integer.parseInt(args[i]);
            }

            System.out.println("The sum of squares of the four elements is: " + sumOfSquares);
        } catch (CheckArgument e) {
            System.out.println(e.getMessage());
        }
    }
}
