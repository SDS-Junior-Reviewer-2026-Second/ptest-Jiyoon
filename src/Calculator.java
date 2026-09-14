public class Calculator {

    private int result;

    Calculator() {
        result = 0;
    }

    public void plus(int a, int b) {
        result = a + b;
    }

    public void minus(int a, int b) {
        result = a - b;
    }

    public void divide(int a, int b) {
        if (b != 0)
            result = a / b;
        else
            throw new ArithmeticException("Can not divide by zero.");
    }

    public void multiple(int a, int b) {
        result = a * b;
    }

    public void printResult() {
        System.out.println("Result: " + result);
    }
}