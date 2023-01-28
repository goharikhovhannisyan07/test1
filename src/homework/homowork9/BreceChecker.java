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
                    stack.push(c);
                    char var = (char) stack.pop();
                    if (var != ')') {
                        System.err.println("Error: " + i + " opened " + var + " but closed )" );
                    }
                    break;
                case '[':
                    stack.push(c);
                    char var2 = (char) stack.pop();
                    if (var2 != ']') {
                        System.err.println("Error: " + i + " opened " + var2 + " but closed } " );
                    }
                    break;
            }
        }
    }
}
