class Superclass {
    private int superClassVariable;

    
    public Superclass(int value) {
        this.superClassVariable = value;
        System.out.println("Superclass Constructor initialized with value: " + value);
    }

    public void display() {
        System.out.println("Superclass Variable: " + superClassVariable);
    }
}

class Subclass extends Superclass {
    private int subclassVariable;


    public Subclass(int superValue, int subValue) {
        super(superValue);
        this.subclassVariable = subValue;
        System.out.println("Subclass Constructor initialized with value: " + subValue);
    }


    public void display() {
        super.display(); 
        System.out.println("Subclass Variable: " + subclassVariable);
    }
}

public class ConstructorInitializationExample {
    public static void main(String[] args) {

        Subclass obj = new Subclass(10, 20);



        obj.display();
    }
}
