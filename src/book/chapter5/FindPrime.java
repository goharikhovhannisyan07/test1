package book.chapter5;

public class FindPrime {

    public static void main(String[] args) {
        int num;
        boolean IsPrime;

        num = 14;
        if (num < 2) IsPrime = false;
        else IsPrime = true;

        for (int i = 2; i <= num / i; i++) {
            if ((num % 2) == 0) {
                IsPrime = false;
                break;
            }
        }
        if (IsPrime) System.out.println("Prime");
        else System.out.println("Not Prime");
    }
}
