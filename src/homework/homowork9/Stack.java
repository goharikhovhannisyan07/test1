package homework.homowork9;

public class Stack {

    private int[] array = new int[10];
    private int tos;


    Stack() {
        tos = -1;

    }

    public void push(int item) {
        if (tos == array.length) {
            extend();
        } else {
            array[++tos] = item;
        }
    }

    private void extend() {
        int[] temp = new int[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            temp[i] = array[i];
        }
        array = temp;
    }

    public int pop() {
        if (tos < 0) {
            return -1;
        }
        return array[tos--];
    }

    public int getTos() {
        return tos;
    }

    public void setTos(int tos) {
        this.tos = tos;
    }

}
