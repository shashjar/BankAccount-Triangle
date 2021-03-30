public class EquilateralTriangle extends Triangle {

    private String type;

    public EquilateralTriangle(double length) {
        super(length);
        type = "equilateral";
    }

    @Override
    public double calculateArea() {
        double area = Math.sqrt(3)*0.25*getSideLength()*getSideLength();
        return area;
    }

    @Override
    public double calculatePerimeter() {
        double perimeter = 3*getSideLength();
        return perimeter;
    }

    public String toString() {
        return "An " + type + " triangle with sides length " + getSideLength();
    }
}
