import java.util.Scanner;
 public class MultipleCatchExample {

    public static void main(String[] args) {
        try {
            Scanner sc=new Scanner(System.in);
            int numerator = sc.nextInt();
            int denominator = sc.nextInt();
            int result = divide(numerator,denominator);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("General Exception caught: " + e.getMessage());
        }
    }

    public static int divide(int numerator, int denominator) {
        return numerator / denominator;
    }
}