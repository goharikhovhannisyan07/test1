package homework.homowork9;

public class BreceCheckerTest {
    public static void main(String[] args) {
        String text = "Hello (from) [Java}";
        BreceChecker bc = new BreceChecker(text);
        bc.check();
    }
}
