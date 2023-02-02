package book.chapter7;

public class Overload {

    void test() {
        System.out.println("No parametrs");
    }

    void test(int a) {
        System.out.println("a: " + a);
    }

    void test(int a, int b) {
        System.out.println("a: " + a + " " + "b: " + b);
    }

    double test(double a) {
        System.out.println("a: " + a);
        return a * a;
    }
}
