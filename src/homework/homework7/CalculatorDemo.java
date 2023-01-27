package homework.homework7;

public class CalculatorDemo {
    public static void main(String[] args) {

        Calculator cal = new Calculator();
        System.out.println(cal.plus(5.10, 10.0));
        System.out.println(cal.minus(6.5, 5.6));
        System.out.println(cal.divide(0.4, 10.0));
        System.out.println(cal.multiply(5.0, 0.0));


    }
}
