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
                case '[':
                    stack.push(c);
                case '{':
                    stack.push(c);
                case ')':
                   char var = (char) stack.pop();
                    if (var != ')') {
                        System.err.println("Error: " + i + " opened " + var + " but closed " + c);
                    }
                    break;
                case ']':
                    char var2 = (char) stack.pop();
                    if (var2 != ']') {
                        System.err.println("Error: " + i + " opened " + var2 + " but closed " + c);
                    }
                    break;
                    case '}':
                    char var3 = (char) stack.pop();
                    if (var3 != '}') {
                        System.err.println("Error: " + i + " opened " + var3 + " but closed " + c);
                    }
                    break;







//                case '[':
//                    stack.push(c);
//                case ']':
//                    char var2 = (char) stack.pop();
//                    if (var2 != ']') {
//                        System.err.println("Error: " + i + " opened " + var2 + " but closed " + var2);
//                    }
//                    break;
            }
        }
    }
}
