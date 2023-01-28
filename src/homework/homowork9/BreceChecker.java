package homework.homowork9;

public class BreceChecker {

    private String text;
    Stack stack = new Stack();


    public BreceChecker(String text) {
        this.text = text;

    }

    public void check() {
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            switch (c) {
                case '(':
                    stack.pop();
                    break;
                case ')':
                    stack.push(c);
                    System.err.print(" Error:  opened ( but closed " + c + " " + i + "\n");
                case '[':
                    stack.pop();
                    break;
                case '}':
                    stack.push(c);
                    System.err.print(" Error:  opened [ but closed " + c + " " + i + "\n");


            }
        }
    }
}
