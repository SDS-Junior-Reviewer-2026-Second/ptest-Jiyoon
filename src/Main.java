public class Main {
    public static void main(String[] args) {

        Calculator calc = new Calculator();

        calc.plus(3, 4);
        calc.printResult();

        calc.minus(10, 4);
        calc.printResult();

        calc.multiple(3, 4);
        calc.printResult();

        calc.divide(240, 4);
        calc.printResult();
    }
}