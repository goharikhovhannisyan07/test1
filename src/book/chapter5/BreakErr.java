package book.chapter5;

public class BreakErr {

    public static void main(String[] args) {
        one:
        for (int i = 0; i < 3; i++) {
            System.out.println("Pass " + i + ": ");
        }
        for (int i = 0; i < 100; i++) {
            if (i==10)break;//one error!
            System.out.println(i + " ");
        }

    }
}
