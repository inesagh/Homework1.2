package perimeterandarea;

public class Circle extends CalculateAreaOrPerim {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }


    @Override
    public void calculateArea() {
        System.out.println("Area of circle equals " + Math.PI * radius * radius);
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("Perimeter of circle equals " + 2 * Math.PI * radius);
        System.out.println("");
    }
}
