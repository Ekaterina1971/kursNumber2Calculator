package pro.sky.calculator.serviceTests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pro.sky.calculator.CalculatorService;
import pro.sky.calculator.Exception.ArithmeticException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorServiceTests {
    private CalculatorService calculatorService = new CalculatorService();
    @Test
    void sumNambers_PozitiveResult(){
        int num1 = 5;
        int num2 = 4;
        String expected = calculatorService.sumNambers(num1,num2);
        String actual = num1 + " + " + num2 + " = " + (num1 + num2);
        assertEquals(expected, actual);

    }
    @Test
    void sumNambers_NegativeResult() {
        int num1 = -9;
        int num2 = -3;
        String expected = calculatorService.sumNambers(num1, num2);
        String actual = num1 + " + " + num2 + " = " + (num1 + num2);
        assertEquals(expected, actual);

    }
    @Test
    void subtractNambers_PozitiveResult(){
        int num1 = 15;
        int num2 = 3;
        String expected = calculatorService.subtractNambers(num1, num2);
        String actual = num1 + " - " + num2 + " = " + (num1 - num2);
        assertEquals(expected, actual);

    }
    @Test
    void subtractNambers_NegativeResult(){
        int num1 = 5;
        int num2 = 8;
        String expected = calculatorService.subtractNambers(num1, num2);
        String actual = num1 + " - " + num2 + " = " + (num1 - num2);
        assertEquals(expected, actual);
    }
    @Test
    void multiplyNambers_PozitiveResult(){
        int num1 = 12;
        int num2 = 5;
        String expected = calculatorService.multiplyNambers(num1, num2);
        String actual = num1 + " * " + num2 + " = " + (num1 * num2);
        assertEquals(expected, actual);
    }
    @Test
    void multiplyNambers_NegativeResult(){
        int num1 = -7;
        int num2 = 5;
        String expected = calculatorService.multiplyNambers(num1, num2);
        String actual = num1 + " * " + num2 + " = " + (num1 * num2);
        assertEquals(expected, actual);
    }
    @Test
    void divideNambers_PozitiveResult(){
        int num1 = 10;
        int num2 = 2;
        String expected = calculatorService.divideNambers(num1, num2);
        String actual = num1 + " / " + num2 + " = " + (num1 / num2);
        assertEquals(expected, actual);
    }
    @Test
    void divideNambers_NegativeResult(){
        int num1 = 10;
        int num2 = -2;
        String expected = calculatorService.divideNambers(num1, num2);
        String actual = num1 + " / " + num2 + " = " + (num1 / num2);
        assertEquals(expected, actual);
    }
    @Test
    void divideNambers_DivisionIntoZero(){
        int num1 = 4;
        int num2 = 0;
        IllegalArgumentException result = Assertions.assertThrows(IllegalArgumentException.class,
                () -> calculatorService.divideNambers(num1, num2));

    }
}
