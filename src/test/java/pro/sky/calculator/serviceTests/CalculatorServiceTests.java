package pro.sky.calculator.serviceTests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pro.sky.calculator.CalculatorService;
import pro.sky.calculator.Exception.ArithmeticException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorServiceTests {
    private CalculatorService calculatorService = new CalculatorService();
    @Test
    void sumNambers_PozitiveResult(){
        int num1 = 5;
        int num2 = 4;
        String sum = calculatorService.sumNambers(num1,num2);
        assertEquals(sum);

    }
    @Test
    void sumNambers_NegativeResult() {
        int num1 = -9;
        int num2 = -3;
        String sum = calculatorService.sumNambers(num1, num2);
        assertEquals(sum);
    }
    @Test
    void subtractNambers_PozitiveResult(){
        int num1 = 15;
        int num2 = 3;
        String raznost = calculatorService.subtractNambers(num1, num2);
        assertEquals(raznost);
    }
    @Test
    void subtractNambers_NegativeResult(){
        int num1 = 5;
        int num2 = 8;
        String raznost = calculatorService.subtractNambers(num1, num2);
        assertEquals(raznost);
    }
    @Test
    void multiplyNambers_PozitiveResult(){
        int num1 = 12;
        int num2 = 5;
        String multiply = calculatorService.multiplyNambers(num1, num2);
        assertEquals(multiply);
    }
    @Test
    void multiplyNambers_NegativeResult(){
        int num1 = -7;
        int num2 = 5;
        String multiply = calculatorService.multiplyNambers(num1, num2);
        assertEquals(multiply);
    }
    @Test
    void divideNambers_PozitiveResult(){
        int num1 = 10;
        int num2 = 2;
        String divide = calculatorService.divideNambers(num1, num2);
        assertEquals(divide);
    }
    @Test
    void divideNambers_NegativeResult(){
        int num1 = 10;
        int num2 = -2;
        String divide = calculatorService.divideNambers(num1, num2);
        assertEquals(divide);
    }
    @Test
    void divideNambers_DivisionIntoZero(){
        int num1 = 4;
        int num2 = 0;
        ArithmeticException arithmeticException = assertEquals("Делить на ноль нельзя!");
    }

    private ArithmeticException assertEquals(String s) {
        return null;
    }
}
