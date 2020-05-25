package inheritance;

public class Shapes {
    public static void main(String[] args) {
        ColorTriangle t1 = new ColorTriangle("blue", "counter", 2.0, 2.0);
        ColorTriangle t2 = new ColorTriangle("red", "painted over", 8.0, 12.0);
        //Triangle t1 = new Triangle();
        //Triangle t2 = new Triangle("contour", 8.0, 12.0);
        Triangle t3 = new Triangle(4.0);
        Rectangle r1 = new Rectangle(6.0, 6.0);
        Circle c1 = new Circle(9.0);

        //t1 = t2;

        System.out.println("Information about t1: ");
        t1.showColor();
        t1.showDim();
        t1.showStyle();
        System.out.println("Area - " + t1.area() + System.lineSeparator());

        System.out.println("Information about t2: ");
        t2.showColor();
        t2.showStyle();
        t2.showDim();
        System.out.println("Area - " + t2.area() + System.lineSeparator());

        System.out.println("Information about t3: ");
        t3.showStyle();
        t3.showDim();
        System.out.println("Area - " + t3.area() + System.lineSeparator());

        System.out.println("Information about r1: ");
        r1.showDim();
        System.out.println("Area - " + r1.area() + System.lineSeparator() + "Square - "
                +  r1.isSquare() + System.lineSeparator());

        System.out.println("Information about c1: ");
        c1.showDim();
        System.out.println("Area - "+ c1.area());
    }
}
