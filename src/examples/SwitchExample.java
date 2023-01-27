package examples;

public class SwitchExample {

    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {
            String number;
            switch (i){
                case 1:
                    number="One";
                    System.out.println("One");
                case 2:
                    number="Two";
                    System.out.println("Two");
                case 3:
                    number="Three";
                default:
                    System.out.println("Numbers");
            }
        }
    }
}
