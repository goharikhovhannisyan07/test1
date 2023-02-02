package book.chapter7;

public class VarArgs2 {

    static void vaTest(String msg, int... v) {
        System.out.println();

        for (int x : v) {
            System.out.print("x: " + x);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        vaTest("One vararg: ", 10);
        vaTest("Three varargs: ", 1, 2, 3);
        vaTest("No varargs: " );
    }

    private static void vaTest(String s) {
    }

    private static void vaTest(String s, int i, int i1, int i2) {
    }

    private static void vaTest(String s, int i) {
    }
}
