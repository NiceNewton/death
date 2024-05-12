import java.util.Scanner;

class Toy {
    int id;
    String name;
    int quantity;
    double price;

    public Toy(int id, String name, int quantity, double price) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String toString() {
        return "Toy ID: " + id + ", Name: " + name + ", Quantity: " + quantity + ", Price: " + price;
    }
}

public class ToyBilling {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many toy details do you want to enter? ");
        int numToys = scanner.nextInt();

        Toy[] toys = new Toy[numToys];

        for (int i = 0; i < numToys; i++) {
            System.out.println("Enter details for toy " + (i + 1));

            System.out.print("ID: ");
            int id = scanner.nextInt();

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Quantity: ");
            int quantity = scanner.nextInt();

            System.out.print("Price: ");
            double price = scanner.nextDouble();

            toys[i] = new Toy(id, name, quantity, price);
        }

        double totalPrice = 0;

        System.out.println("\nToy Details:");
        for (Toy toy : toys) {
            System.out.println(toy);
            totalPrice += toy.price * toy.quantity;
        }

        System.out.println("\nGrand total: " + totalPrice);
    }
}
