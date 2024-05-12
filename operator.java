public class OperatorExample {
    public static void main(String[] args) {
       
        int a = 5; 
        int b = 3; 
        int bitwiseAndResult = a & b;
        System.out.println("Bitwise AND result: " + bitwiseAndResult);

        
        int bitwiseOrResult = a | b;
        System.out.println("Bitwise OR result: " + bitwiseOrResult);

        
        int bitwiseXORResult = a ^ b;
        System.out.println("Bitwise XOR result: " + bitwiseXORResult);

       
        int bitwiseNotResult = ~a;
        System.out.println("Bitwise NOT result: " + bitwiseNotResult);

       
        boolean logicalAndResult = (a > 0) && (b > 0);
        System.out.println("Logical AND result: " + logicalAndResult);

       
        boolean logicalOrResult = (a > 0) || (b > 0);
        System.out.println("Logical OR result: " + logicalOrResult);

        
        int rightShiftResult = a >> 1;
        System.out.println("Right shift result: " + rightShiftResult);

       
        int leftShiftResult = a << 1;
        System.out.println("Left shift result: " + leftShiftResult);

       
        int max = (a > b) ? a : b;
        System.out.println("Maximum value: " + max);
    }
}
