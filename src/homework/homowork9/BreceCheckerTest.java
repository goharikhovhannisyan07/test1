package homework.homowork9;

public class BreceCheckerTest {
    public static void main(String[] args) {
        String text = "(Hello} {Java] ([{2023";
        BreceChecker bc = new BreceChecker(text);
        bc.check();
    }
}
