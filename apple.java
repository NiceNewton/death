public class apple{

    public static void main(String[] args) {
        Apple apple = new Apple();
        Banana banana = new Banana();
        Cherry cherry = new Cherry();

        apple.prDescription();
        banana.printDescription();
        cherry.printDescription();
    }
}

class Apple {
    String type = "Apple";

    public void Description() {
        System.out.println("I am a " + type + ".");
    }
}

class Banana extends Apple {
    String type = "Banana";

    public void Description() {
        System.out.println("I am a " + type + ".");
    }
}

class Cherry extends Apple {
    String type = "Cherry";

    public void Description() {
        System.out.println("I am a " + type + ".");
    }
}