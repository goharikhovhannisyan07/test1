package book.chapter8;

public class Rectangle extends Figure {

    Rectangle(double a, double b) {
        super(a, b);
    }

    double area() { //Override
        System.out.println("Inside Area for Rectangle");
        return dim1 * dim2;
    }
}
