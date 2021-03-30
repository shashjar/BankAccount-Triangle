public abstract class Triangle {

    private double sideLength;

    public Triangle(double length) {
        sideLength = length;
    }

    public double getSideLength() {
        return sideLength;
    }

    public abstract double calculateArea();

    public abstract double calculatePerimeter();

}
