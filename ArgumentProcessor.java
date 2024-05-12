public class CheckArgument extends Exception {
  public CheckArgument(String message) {
    super(message);
  }
}

public class ArgumentProcessor {

  public static void main(String[] args) throws CheckArgument {
    if (args.length < 4) {
      throw new CheckArgument("Please provide at least four arguments!");
    }

    int sumOfSquares = 0;
    for (String arg : args) {
      int number = Integer.parseInt(arg);
      sumOfSquares += number * number;
    }

    System.out.println("Sum of squares: " + sumOfSquares);
  }
}
