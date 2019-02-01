/**
 * C08 L13
 * 
 * Using abstract methods and classes.
 */
abstract class Figure2 {
    double dim1;
    double dim2;

    Figure2(double a, double b) {
        dim1 = a;
        dim2 = b;
    }

    abstract double area();
}

class Rectangle2 extends Figure2 {
    Rectangle2(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("Inside Area for Rectangle.");
        return dim1 * dim2;
    }
}

class Triangle2 extends Figure2 {
    Triangle2(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("Inside Area for Triangle.");
        return dim1 * dim2 / 2;
    }
}

public class AbstractAreas {

    public static void main(String[] args) {
        // Figure2 f = new Figure(10, 10);
        Rectangle2 r = new Rectangle2(9, 5);

        Triangle2 t = new Triangle2(10, 8);
        Figure2 figref;

        figref = r;
        System.out.println("Area is " + figref.area());

        figref = t;
        System.out.println("Area is " + figref.area());
    }
}