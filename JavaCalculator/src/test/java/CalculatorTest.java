package calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void shouldAddTwoNumbers() {

        double result = calculator.add(10, 5);

        assertEquals(15, result);
    }

    @Test
    void shouldSubtractTwoNumbers() {

        double result = calculator.subtract(10, 5);

        assertEquals(5, result);
    }

    @Test
    void shouldMultiplyTwoNumbers() {

        double result = calculator.multiply(10, 5);

        assertEquals(50, result);
    }

    @Test
    void shouldDivideTwoNumbers() {

        double result = calculator.divide(10, 5);

        assertEquals(2, result);
    }

    @Test
    void shouldCalculateModulo() {

        double result = calculator.modulo(10, 3);

        assertEquals(1, result);
    }

    @Test
    void shouldCalculatePower() {

        double result = calculator.power(2, 8);

        assertEquals(256, result);
    }

    @Test
    void shouldCalculateSquareRoot() {

        double result = calculator.squareRoot(144);

        assertEquals(12, result);
    }

    @Test
    void shouldCalculateUsingOperator() {

        assertEquals(15, calculator.calculate(10, '+', 5));
        assertEquals(5, calculator.calculate(10, '-', 5));
        assertEquals(50, calculator.calculate(10, '*', 5));
        assertEquals(2, calculator.calculate(10, '/', 5));
        assertEquals(1, calculator.calculate(10, '%', 3));
        assertEquals(100, calculator.calculate(10, '^', 2));
    }

    @Test
    void shouldRejectDivisionByZero() {

        ArithmeticException exception =
                assertThrows(
                        ArithmeticException.class,
                        () -> calculator.divide(10, 0)
                );

        assertEquals(
                "Cannot divide by zero.",
                exception.getMessage()
        );
    }

    @Test
    void shouldRejectModuloByZero() {

        assertThrows(
                ArithmeticException.class,
                () -> calculator.modulo(10, 0)
        );
    }

    @Test
    void shouldRejectNegativeSquareRoot() {

        assertThrows(
                ArithmeticException.class,
                () -> calculator.squareRoot(-25)
        );
    }

    @Test
    void shouldRejectInvalidOperator() {

        assertThrows(
                IllegalArgumentException.class,
                () -> calculator.calculate(10, '&', 5)
        );
    }
}

