package homework.homowork9;

public class Stack {

    private int[] array = new int[10];
    private int tos;

    Stack() {
        tos = -1;
    }

    public void push(int item) {
        if (tos == 9) {
            System.err.println("Stack is full");
        } else {
            array[++tos] = item;
        }
    }

    public int pop() {
        if (tos < 0) {
            System.err.println("Stack is empty ");
            return 0;
        }
        return array[tos--];
    }

    public boolean isEmpty() {
        return tos == -1;
    }
}
