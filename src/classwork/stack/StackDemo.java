package classwork.stack;

public class StackDemo {
    public static void main(String[] args) {

        Stack st = new Stack();
        st.push(5);
        st.push(7);
        st.push(14);
        st.push(50);
        st.push(4);
        st.push(77);
        st.push(-1);
        st.push(41);
        st.push(65);
        st.push(8);
        st.push(3);
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());


    }
}

