package homework.homework6;

public class ArrayUtilDemo {

    public static void main(String[] args) {
        int[] array = {2, 5, 8, 10, 88, 22, 11, 66, 12, 30, 6, 4, 3};
        ArrayUtil au = new ArrayUtil();
        au.maxOfArray(array);
        au.minOfArray(array);
        au.coupleOfArray(array);
        au.OddOfArray(array);
        au.countOfEventsArray(array);
        au.countOfOddsArray(array);
        au.sumAndAvgArray(array);
        au.firtsElemetArray(array);
        au.lastElemetArray(array);
        au.middleElementArray(array);
    }
}
