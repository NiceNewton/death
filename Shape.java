abstract class Shape {
    abstract double calcArea();
}

class Circle extends Shape {
    double radius;

     Circle(double radius) {
        this.radius = radius;
    }

    double calcArea() {
        return Math.PI * radius * radius;
    }
}

class Triangle extends Shape {
    double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

   
    double calcArea() {
        return 0.5 * base * height;
    }
}

public class Main {
  public static void main(String[] args) {
    Circle circle = new Circle(5);
    Triangle triangle = new Triangle(4, 6);

    System.out.println("Circle Area: " + circle.calcArea());
    System.out.println("Triangle Area: " + triangle.calcArea());
  }
}
