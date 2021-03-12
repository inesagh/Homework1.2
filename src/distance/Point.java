package distance;

public class Point {
    private double coordinateX;
    private double coordinateY;

    public Point(double coordinateX, double coordinateY) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }

    public double getCoordinateX() {
        return coordinateX;
    }

    public void setCoordinateX(double coordinateX) {
        this.coordinateX = coordinateX;
    }

    public double getCoordinateY() {
        return coordinateY;
    }

    public void setCoordinateY(double coordinateY) {
        this.coordinateY = coordinateY;
    }

    public void distance(){
        System.out.println("Distance = " + Math.sqrt((coordinateX * coordinateX) + (coordinateY * coordinateY)));
    }
    public void distance(Point point){
        double dist = Math.sqrt(Math.pow((coordinateX- point.coordinateX), 2) + Math.pow((coordinateY- point.coordinateY),2));
        System.out.println("Distance between two point is = " + dist);
    }
}
