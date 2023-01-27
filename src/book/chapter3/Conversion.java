package book.chapter3;

public class Conversion {
    public static void main(String[] args) {
        byte b;
        int i = 257;
        double d = 323.142;

        System.out.println("Convertion of int to byte ");
        b = (byte) i;
        System.out.println("i and b " + i + " " + b);
        System.out.println("\nConvertiom of double to int ");
        i = (int) d;
        System.out.println("d and i " + i + " " + d);
        System.out.println("\nConvertion of double to byte ");
        b = (byte) d;
        System.out.println("d and b " + d + " " + b);
    }
}
