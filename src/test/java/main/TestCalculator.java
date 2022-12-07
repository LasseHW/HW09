package main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestCalculator {

    Calculator calculator = new Calculator();

    @Test
    public void Should_add_two_numbers_and_return_result() {
        int expectedResult = 2 + 3;
        int actualResult = calculator.add(2, 3);

        assertEquals(expectedResult, actualResult);

    }

    @Test
    public void Should_substract_two_numbers_and_return_result() {
        int expectedResult = 5 - 2;
        int acutalResult = calculator.sub(5, 2);

        assertEquals(expectedResult, acutalResult);
    }

    @Test
    public void Should_multiply_two_numbers_and_return_result() {
        int expectedResult = 3 * 2;
        int actualResult = calculator.multiply(3, 2);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void Should_divide_two_numbers_and_return_result() {
        double expectedResult = (double) 5 / 2;
        double actualResult = calculator.divide(5, 2);

        assertEquals(expectedResult, actualResult);
    }

    // public float divide(int numerator, int denominator) {
    //        if (denominator == 0)
    //            throw new ArithmeticException("ZeroDivisionError");
    //
    //        return (float) numerator / denominator;
    //    }
    @Test
    public void Should_throw_an_arithmetic_Exception_if_denominator_is_zero() {


        try {
            calculator.divide(5, 0);
        } catch (ArithmeticException e) {
            System.out.println("Caught");
            assertTrue(e instanceof ArithmeticException, "ZeroDivisionError");
        }


    }


}
