package homework.homowork9;

public class BreceChecker {

    private String text;


    public BreceChecker(String text) {
        this.text = text;

    }

    public void check() {
        Stack stack = new Stack();
        int last;
        char lastBracket;
        for (int i = 0; i < text.length(); i++) {

            char c = text.charAt(i);
            switch (c) {
                case '(':
                case '[':
                case '{':
                    stack.push(c);
                    break;
                case ')':
                    last = stack.pop();
                    if (last == 0) {
                        System.err.println("Error at " + i + " closed " + c + " but not opened");
                    } else {
                        lastBracket = (char) last;
                        if (lastBracket != '(') {
                            System.err.println("Error at " + i + " opened " + lastBracket + " but closed " + c);
                        }
                    }
                    break;
                case ']':
                    last = stack.pop();
                    if (last == 0) {
                        System.err.println("Error at " + i + " closed " + c + " but not opened");
                    } else {
                        lastBracket = (char) last;
                        if (lastBracket != '[') {
                            System.err.println("Error at " + i + " opened " + lastBracket + " but closed " + c);
                        }
                    }
                    break;
                case '}':
                    last = stack.pop();
                    if (last == 0) {
                        System.err.println("Error at " + i + " closed " + c + " but not opened");
                    } else {
                        lastBracket = (char) last;
                        if (lastBracket != '{') {
                            System.err.println("Error at " + i + " opened " + lastBracket + " but closed " + c);
                        }
                    }
                    break;
            }
        }
        while (!stack.isEmpty()) {
            System.err.println("Error! opened " + (char) stack.pop() + " but not closed");
        }

    }
}
