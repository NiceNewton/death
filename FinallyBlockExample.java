public class FinallyBlockExample {

  public static void main(String[] args) {
    int data = 0;
    
    try {
     
      data = 25 / 0;
      System.out.println("Data value: " + data);
    } catch (ArithmeticException e) {
      System.out.println("Exception caught: " + e.getMessage());
    } finally {

      System.out.println("This is always executed in finally block!");
      
    }
    System.out.println("Program continues...");
  }
}
