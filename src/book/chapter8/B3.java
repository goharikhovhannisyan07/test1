package book.chapter8;

public class B3 extends A3 {

    int i;

    B3(int a, int b) {
        super.i = a;
        i = b;
    }

    void show() {
        System.out.println("i in superclass -> " + super.i);
        System.out.println("i in subclass -> " + i);
    }


}
