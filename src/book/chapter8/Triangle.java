package book.chapter8;

public class Triangle extends Figure {

    Triangle(double a, double b) {
        super(a, b);
    }

    double area() { //Override
        System.out.println("Inside Area for Triangle");
        return dim1 * dim2 / 2;
    }
}
