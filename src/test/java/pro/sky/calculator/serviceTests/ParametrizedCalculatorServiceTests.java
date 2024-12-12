package pro.sky.calculator.serviceTests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import pro.sky.calculator.CalculatorService;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParametrizedCalculatorServiceTests {
    private CalculatorService calculatorService = new CalculatorService();

    @ParameterizedTest
    @MethodSource("indicateNumber")
    void sumNamberst(Integer num1, Integer num2) {
        String sum = calculatorService.sumNambers(num1, num2);
        assertEquals(sum);
    }

    private void assertEquals(String sum) {
    }

    @ParameterizedTest
    @MethodSource("indicateNumber")
    void subtractNambers(Integer num1, Integer num2) {
        String raznost = calculatorService.subtractNambers(num1, num2);
        assertEquals(raznost);
    }
    @ParameterizedTest
    @MethodSource("indicateNumber")
    void multiplyNambers(Integer num1, Integer num2){
        String multiply = calculatorService.multiplyNambers(num1, num2);
        assertEquals(multiply);
    }
    @ParameterizedTest
    @MethodSource("indicateNumber")
    void divideNambers(Integer num1, Integer num2){
        String divide = calculatorService.divideNambers(num1, num2);
        assertEquals(divide);
    }
    private static Stream<Arguments> indicateNumber() {
        return Stream.of(
                Arguments.of(5, 5),
                Arguments.of(8, -2),
                Arguments.of(Integer.MAX_VALUE, Integer.MAX_VALUE)
        );
    }
}
