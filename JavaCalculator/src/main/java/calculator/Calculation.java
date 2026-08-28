package calculator;

public class Calculation {

    private final double firstNumber;
    private final char operator;
    private final double secondNumber;
    private final double result;

    public Calculation(
            double firstNumber,
            char operator,
            double secondNumber,
            double result) {

        this.firstNumber = firstNumber;
        this.operator = operator;
        this.secondNumber = secondNumber;
        this.result = result;
    }

    public double getFirstNumber() {
        return firstNumber;
    }

    public char getOperator() {
        return operator;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public double getResult() {
        return result;
    }

    @Override
    public String toString() {
        return firstNumber
                + " "
                + operator
                + " "
                + secondNumber
                + " = "
                + result;
    }
}

