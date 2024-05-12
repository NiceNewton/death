public class ShapeArea {

    public static void main(String[] args) {
       
        double circleArea = area(5.0); // Calling with radius as double
        System.out.println("Area of circle: " + circleArea);

       
        double rectangleArea = area(4.0, 3.0); // Calling with length and width as doubles
        System.out.println("Area of rectangle: " + rectangleArea);


        double triangleArea = area(6.0, 4.0); // Calling with base and height as doubles
        System.out.println("Area of triangle: " + triangleArea);
    }


    public static double area(double radius) {
        return Math.PI * radius * radius;
    }


    public static double area(double length, double width) {
        return length * width;
    }


    public static double area(double base, double height) {
        return 0.5 * base * height;
    }
}
