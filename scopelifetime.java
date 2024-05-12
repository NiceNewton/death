public class ScopeLifetime {

    public static void main(String[] args) {
        // Global variable (scope: entire program, lifetime: until program ends)
        int globalVar = 10;

        
        int localVar = 20;

        System.out.println("Global variable inside main: " + globalVar);
        System.out.println("Local variable inside main: " + localVar);

       
        if (true) {
            int blockVar = 30;
            System.out.println("Block variable inside if block: " + blockVar);
        }

        localVar = 40;

        System.out.println("Global variable with shadowing: " + globalVar); 
        System.out.println("Local variable after shadowing: " + localVar); 

        printLocalVariables();
    }

    public static void printLocalVariables() {
       
        int methodVar = 50;
        System.out.println("Local variable inside printLocalVariables: " + methodVar);

      
    }
}
