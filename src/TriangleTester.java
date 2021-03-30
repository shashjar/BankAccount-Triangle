public class TriangleTester {

    public static void main(String[] args) {
        Triangle[] triangles = new Triangle[4];

        Triangle right1 = new RightTriangle(4.0);
        Triangle right2 = new RightTriangle(6.0);

        Triangle eq1 = new EquilateralTriangle(4.0);
        Triangle eq2 = new EquilateralTriangle(6.0);

        triangles[0] = right1;
        triangles[1] = right2;
        triangles[2] = eq1;
        triangles[3] = eq2;

        for (Triangle a : triangles) {
            System.out.println(a);
            System.out.println("Area = " + a.calculateArea());
            System.out.println("Perimeter = " + a.calculatePerimeter());
            System.out.println("Ratio = " + ((double) a.calculateArea())/a.calculatePerimeter());
        }
    }

}
