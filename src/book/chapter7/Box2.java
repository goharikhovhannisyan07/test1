package book.chapter7;

public class Box2 {

    double width;
    double heigth;
    double depth;

    Box2(Box2 ob) {
        width = ob.width;
        heigth = ob.heigth;
        depth = ob.depth;

    }

    Box2(double w, double h, double d) {
        width = w;
        heigth = h;
        depth = d;
    }

    Box2() {
        width = -1;
        heigth = -1;
        depth = -1;
    }

    Box2(double len) {
        width = heigth = depth = len;
    }

    double volume() {
        return width * heigth * depth;
    }
}
