package homework.homework7;

public class Calculator {

    double plus(double a, double b) {
        double c = a + b;
        return c;
    }

    double minus(double x, double y) {
        double d = x - y;
        return d;
    }

    double divide(double k, double j) {
        if (j == 0) {
            System.out.println("0-ի չի բաժանվում ");
            return -1;
        } else {
            double z = k / j;
            return z;
        }
    }

    double multiply(double l, double m) {
        double g = l * m;
        return g;
    }

}


