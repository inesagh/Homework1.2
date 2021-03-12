package perimeterandarea;

public class Rectangle extends CalculateAreaOrPerim {
    private int height;
    private int width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public void calculateArea() {
        System.out.println("Area of rectangle equals " + width * height);
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("Perimeter of rectangle equals " + 2 * (width + height));
        System.out.println("");
    }
}