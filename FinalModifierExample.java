public class FinalModifierExample {
   
    public static final int MAX_VALUE = 100;


    public final void displayMessage() {
        System.out.println("This is a final method.");
    }

    public static void main(String[] args) {
        FinalModifierExample obj = new FinalModifierExample();
        System.out.println("Maximum value: " + MAX_VALUE);
        obj.displayMessage();
    }
}
