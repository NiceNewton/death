import java.util.Scanner;

// 2D shape class
class Shape2D {
    double area; // Area in square feet

    // Parameterized constructor for 2D shape
    Shape2D(double area) {
        this.area = area;
    }

    // Method to calculate the cost of 2D shape
    double calculateCost2D() {
        return area * 40; // Cost of sheet: Rs 40 per square ft.
    }
}

// 3D shape class inheriting from 2D shape
class Shape3D extends Shape2D {
    double volume; // Volume in cubic feet

    // Parameterized constructor for 3D shape
    Shape3D(double area, double volume) {
        super(area);
        this.volume = volume;
    }

    // Method to calculate the cost of 3D shape
    double calculateCost3D() {
        return volume * 60; // Cost of box: Rs 60 per cubic ft.
    }
}

public class PlasticCostCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the area of the 2D sheet (in square feet): ");
        double sheetArea = scanner.nextDouble();


        System.out.print("Enter the area of the 3D box (in square feet): ");
        double boxArea = scanner.nextDouble();
        System.out.print("Enter the volume of the 3D box (in cubic feet): ");
        double boxVolume = scanner.nextDouble();


        Shape2D sheet = new Shape2D(sheetArea);
        Shape3D box = new Shape3D(boxArea, boxVolume);


        double cost2D = sheet.calculateCost2D();
        double cost3D = box.calculateCost3D();

        System.out.println("\nCost of 2D sheet: Rs " + cost2D);
        System.out.println("Cost of 3D box: Rs " + cost3D);

        
    }
}
