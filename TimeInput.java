import java.util.Scanner;

class HrsException extends Exception {
  public HrsException(String message) {
    super(message);
  }
}

class MinException extends Exception {
  public MinsException(String message) {
    super(message);
  }
}

class SecException extends Exception {
  public SecException(String message) {
    super(message);
  }
}

class Time {
  private int hours;
  private int minutes;
  private int seconds;

  public void getTimeFromUser() throws HrsException, MinException, SecException {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter hours (0-24): ");
    hours = scanner.nextInt();

    if (hours < 0 || hours > 24) {
      throw new HrsException("Hours must be between 0 and 24");
    }

    System.out.print("Enter minutes (0-59): ");
    minutes = scanner.nextInt();

    if (minutes < 0 || minutes > 59) {
      throw new MinException("Minutes must be between 0 and 59");
    }

    System.out.print("Enter seconds (0-59): ");
    seconds = scanner.nextInt();

    if (seconds < 0 || seconds > 59) {
      throw new SecException("Seconds must be between 0 and 59");
    }
  }


public class TimeInput {
  public static void main(String[] args) {
    Time time = new Time();
    try {
      time.getTimeFromUser();
      System.out.println("Time entered successfully!");

    } catch (HrsException | MinException | SecException e) {
      System.out.println("Error: " + e.getMessage());
    }
  }
}
