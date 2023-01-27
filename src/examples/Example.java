package examples;

public class Example {

    static boolean doJob() {
        for (int i = 0; i < 7; i++) {
            System.out.println("Do job inside for loop");
        }
        return true;
    }

    public static void main(String[] args) {
//        float f1 = 2.3f;
//        float[][] f2 = {{42.0f}, {1.7f, 2.3f}, {2.6f, 2.7f}};
//        float[] f3 = {2.7f};
//        long x = 42L;
//        // insert code here
//        System.out.println("true");

        for (int i = 0; i < 3; i++) {
            switch (i) {
                case 0:
                    break;
                case 1:
                    System.out.print("one ");
                case 2:
                    System.out.print("two ");
                case 3:
                    System.out.print("three ");
            }
        }
        System.out.println("done");
    }
}
