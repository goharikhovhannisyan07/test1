package homework.homework6;

public class ArrayUtil {

    void maxOfArray(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(max);
    }

    void minOfArray(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];

            }
        }
        System.out.println(min);
    }

    void coupleOfArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.print(" զույգերը");
        System.out.println();
    }

    void OddOfArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println(" կենտեր");
    }

    void countOfEventsArray(int[] array) {
        int countOfEvents = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                countOfEvents++;
            }
        }
        System.out.print("զույգերի քանակը —> ");
        System.out.println(countOfEvents);
    }

    void countOfOddsArray(int[] array) {
        int countOfOdds = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                countOfOdds++;

            }
        }
        System.out.print("կենտերի քանակը —> ");
        System.out.print(countOfOdds);
        System.out.println();
    }

    void sumAndAvgArray(int[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("sum —> " + sum);
        double avg = sum / array.length;
        System.out.println("avg —>" + avg);
    }

    void firtsElemetArray(int[] array) {
        System.out.println("առաջին էլէմենտը —> " + array[0]);
    }

    void lastElemetArray(int[] array) {
        System.out.println("վերջին էլէմենտը —> " + array[array.length - 1]);
    }

    void middleElementArray(int[] array) {
        System.out.println("մեջտեղի էլեմենտը —> " + array[array.length / 2]);

    }
}
