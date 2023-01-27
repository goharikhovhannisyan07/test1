package homework.homework3;

public class ArrayUtil2 {

    public static void main(String[] args) {
        int[] array = {10, 78, 5, -9, 74, 11, 7, 125, 22, 39};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i != array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.print("զույգերը —> ");

        //Տպեք մասիվի բոլոր զույգ էլեմենտները,
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
        System.out.print("կենտերը —> ");

        //Տպեք մասիվի բոլոր կենտ էլեմենտները։
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
        System.out.print("զույգերի քանակը —> ");

        //Տպեք զույգերի քանակը։
        int countOfEvents = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                countOfEvents++;

            }
        }
        System.out.println(countOfEvents);
        System.out.print("կենտերի քանակը —> ");


        //Տպեք կենտերի քանակը
        int countOfOdds = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                countOfOdds++;

            }
        }
        System.out.print(countOfOdds);
        System.out.println();


        //Տպեք մասիվի բոլոր թվերի միջին թվաբանականը (բոլոր էլեմենտների գումարը /
        // էլեմենտների քանակի վրա)
        // Տպեք մասիվի էլեմենտների գումարը։
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("sum —> " + sum);
        double avg = sum / array.length;
        System.out.println("avg —>" + avg);


        //Տպեք մասիվի առաջին էլեմենտը։
        System.out.println("առաջին էլէմենտը —> " + array[0]);

        //Տպեք մասիվի վերջին էլեմենտը։
        System.out.println("վերջին էլէմենտը —> " + array[array.length - 1]);

        //Տպեք մասիվի մեջտեղի էլեմենտը։
        System.out.println("մեջտեղի էլեմենտը —> " + array[array.length / 2]);
    }
}
