package inheritance;

public class Circle extends TwoDShape {
    Circle() {
        super();
    }

    Circle(double x) {
        super(x, "circle");
    }

    Circle(Circle ob) {
        super(ob);
    }

    double area() {
        return Math.PI * (getWidth() / 2) * (getHeight() / 2);
    }

}
