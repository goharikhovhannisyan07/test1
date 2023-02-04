package book.chapter8;

public class B6 extends A6 {

    int k;

    B6(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    //Overload
    void show(String msg) {
        System.out.println(msg + k);

    }
}
