interface Motor {
    int capacity = 5000; 

    void run();
    void consume();
}

class WashingMachine implements Motor {
    @Override
    public void run() {
        System.out.println("Washing machine is running...");
    }

    @Override
    public void consume() {
        System.out.println("Washing machine is consuming water and electricity...");
    }

    public void checkCapacity() {
        System.out.println("Motor capacity: " + Motor.capacity);
    }
}

public class Main {
    public static void main(String[] args) {
        WashingMachine washingMachine = new WashingMachine();
        washingMachine.run();
        washingMachine.consume();
        washingMachine.checkCapacity();
    }
}






