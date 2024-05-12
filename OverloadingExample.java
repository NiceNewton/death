public class OverloadingExample {
    
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public OverloadingExample() {
        System.out.println("Default Constructor");
    }

    public OverloadingExample(int value) {
        System.out.println("Parameterized Constructor with value: " + value);
    }

    public static void main(String[] args) {
        OverloadingExample calculator = new OverloadingExample();

       
        int sumInt = calculator.add(5, 7);
        System.out.println("Sum (int): " + sumInt);

        double sumDouble = calculator.add(3.5, 2.7);
        System.out.println("Sum (double): " + sumDouble);


        OverloadingExample obj1 = new OverloadingExample();
        OverloadingExample obj2 = new OverloadingExample(42);
    }
}
