public class FunctionOverloadingExample {

    public int add(int a, int b) {
        return a + b;
    }


    public float add(int a, float b) {
        return a + b;
    }


    public float add(float a, int b) {
        return a + b;
    }


    public float add(float a, float b) {
        return a + b;
    }

    public static void main(String[] args) {
        FunctionOverloadingExample calculator = new FunctionOverloadingExample();


        int sum1 = calculator.add(5, 7);
        System.out.println("Sum (int, int): " + sum1);

        float sum2 = calculator.add(10, 3.5f);
        System.out.println("Sum (int, float): " + sum2);

        float sum3 = calculator.add(4.5f, 2);
        System.out.println("Sum (float, int): " + sum3);

        float sum4 = calculator.add(3.2f, 1.8f);
        System.out.println("Sum (float, float): " + sum4);
    }
}
