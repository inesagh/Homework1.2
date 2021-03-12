package perimeterandarea;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(3);
        Rectangle rectangle = new Rectangle(2, 3);
        Triangle triangle = new Triangle(2, 3, 4);
        circle.calculateArea();
        circle.calculatePerimeter();
        rectangle.calculateArea();
        rectangle.calculatePerimeter();
        triangle.calculateArea();
        triangle.calculatePerimeter();
    }
}
