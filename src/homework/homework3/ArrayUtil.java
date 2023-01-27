package homework.homework3;

public class ArrayUtil {
    public static void main(String[] args) {

        int[] array = {-2, 5, 8, 10, 32, 22, 77, 66, 12, 300};
        //1.Տպեք մասիվի բոլոր էլեմենտները,

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i != array.length - 1) {
                System.out.print(", ");

            }

        }

        //2.Տպեք մասիվի ամենամեծ թիվը,
        System.out.println();
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];

            }
        }
        System.out.print("max -> " + max);

        System.out.println();

        //3.Տպեք մասիվի ամենափոքրը թիվը
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];

            }
        }
        System.out.print("min -> " + min);

    }
}

