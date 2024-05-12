public class TypeConversionExample {
    public static void main(String[] args) {
        
        int intValue = 10;
        double doubleValue = intValue; 
        System.out.println("Implicit Type Conversion (Widening):");
        System.out.println("int value: " + intValue);
        System.out.println("double value: " + doubleValue);

       
        double anotherDoubleValue = 15.75;
        int anotherIntValue = (int) anotherDoubleValue;
        System.out.println("\nExplicit Type Conversion (Narrowing):");
        System.out.println("double value: " + anotherDoubleValue);
        System.out.println("int value: " + anotherIntValue);


    }
}
