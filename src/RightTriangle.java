public class RightTriangle extends Triangle {

    private String type;

    public RightTriangle(double length) {
        super(length);
        type = "right";
    }

    @Override
    public double calculateArea() {
        double area = getSideLength()*getSideLength() / 2.0;
        return area;
    }

    @Override
    public double calculatePerimeter() {
        double hypotenuse = Math.sqrt(2*getSideLength()*getSideLength());
        double perimeter = 2*getSideLength()+hypotenuse;
        return perimeter;
    }

    public String toString() {
        return "A " + type + " triangle with legs length " + getSideLength();
    }
}
