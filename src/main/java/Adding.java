public class Adding implements Operation {
    @Override
    public double count(double number1, double number2) {
        return number1+number2;
    }

    @Override
    public char getOperator() {
        return '+';
    }
}
