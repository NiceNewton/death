interface Drawable {
  void draw();
}

class Shape {
 public String color;

  public Shape(String color) {
    this.color = color;
  }

  public void displayShapeDetails() {
    System.out.println("Color: " + color);
  }
}

class Rectangle extends Shape implements Drawable {
  public double width;
  public double height;

  public Rectangle(String color, double width, double height) {
    super(color); 
    this.width = width;
    this.height = height;
  }

  
  public void draw() {
    System.out.println("Drawing a rectangle");
  }

  public double calculateArea() {
    return width * height;
  }
}

public class Main {
  public static void main(String[] args) {
    Rectangle rect = new Rectangle("Red", 5.0, 3.0);
    rect.displayShapeDetails(); 
    rect.draw();
    System.out.println("Area: " + rect.calculateArea());
  }
}
