import java.util.Scanner;

class Customer {
    String name;
    String cellNumber;
    String pkg;
    int age;

    public void getData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter customer name: ");
        name = scanner.nextLine();

        System.out.print("Enter customer cell number: ");
        cellNumber = scanner.nextLine();

        System.out.print("Enter customer package: ");
        pkg = scanner.nextLine();

        System.out.print("Enter customer age: ");
        age = scanner.nextInt();
    }

    public void displayData() {
        System.out.println("Customer Name: " + name);
        System.out.println("Customer Cell Number: " + cellNumber);
        System.out.println("Customer Package: " + pkg);
        System.out.println("Customer Age: " + age);
    }
}

class CustomerInfo {

    public static void main(String[] args) {
        Customer[] customers = new Customer[3];

        for (int i = 0; i < customers.length; i++) {
            customers[i] = new Customer();
            customers[i].getData();
        }

        System.out.println("\nCustomer Details:");
        for (Customer customer : customers) {
            customer.displayData();
            System.out.println();
        }
    }
}
