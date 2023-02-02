package book.chapter7;

public class VarArgs4 {
    static void vaTest(int... v) {
        System.out.println("Number of args " + v.length + " Contents: ");

        for (int x : v) {
            System.out.print("x: " + x);
            System.out.println();
        }
    }



    static void vaTest(boolean... v) {
        System.out.println("Number of args " + v.length + " Contents: ");

        for (boolean x : v) {
            System.out.print("x: " + x);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        vaTest(1, 2, 3);
        vaTest(true, false, false);
        //vaTest(); Error!!!
    }
}
