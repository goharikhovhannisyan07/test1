package homework.homework8;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray array = new DynamicArray();
        for (int i = 0; i < 10; i++) {
            array.add(i + 1);
        }
        array.print();
        int indexByValue = array.getIndexByValue(5);
        System.out.println(indexByValue);


    }
}
