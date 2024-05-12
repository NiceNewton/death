 public class appledynamic{

    public static void main(String[] args) {
        Apple apple = new Apple();
        Banana banana = new Banana();
        Cherry cherry = new Cherry();

        // Dynamic method dispatch using showFruits()
        showFruits(apple);
        showFruits(banana);m
        showFruits(cherry);
    }

    // Dynamic method dispatch based on object type
    public static void showFruits(Fruit fruit) {
        fruit.show();
    }
}

class Fruit {
    // Base class method
    public void show() {
        System.out.println("I am a generic fruit.");
    }
}

class Apple extends Fruit {
    @Override
    public void show() {
        System.out.println("I am a juicy apple!");
    }
}

class Banana extends Fruit {
    @Override
    public void show() {
        System.out.println("I am a tasty banana!");
    }
}

class Cherry extends Fruit {
    @Override
    public void show() {
        System.out.println("I am a sweet cherry!");
    }
}
class Main {

    public static void main(String[] args) {
        Apple apple = new Apple();
        Banana banana = new Banana();
        Cherry cherry = new Cherry();

        // Dynamic method dispatch using showFruits()
        showFruits(apple);
        showFruits(banana);
        showFruits(cherry);
    }

    // Dynamic method dispatch based on object type
    public static void showFruits(Fruit fruit) {
        fruit.show();
    }
}

class Fruit {
    // Base class method
    public void show() {
        System.out.println("I am a generic fruit.");
    }
}

class Apple extends Fruit {
    @Override
    public void show() {
        System.out.println("I am a juicy apple!");
    }
}

class Banana extends Fruit {
    @Override
    public void show() {
        System.out.println("I am a tasty banana!");
    }
}

class Cherry extends Fruit {
    @Override
    public void show() {
        System.out.println("I am a sweet cherry!");
    }
}
