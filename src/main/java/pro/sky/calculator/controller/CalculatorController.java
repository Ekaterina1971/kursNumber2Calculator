package pro.sky.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.calculator.service.CalculatorService;

@RestController
@RequestMapping(path="/calculator")
public final class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }
    @GetMapping(path="/calculator")
    public String welcomeCalculator(){
        return" Добро пожаловать в калькулятор";
    }

    @GetMapping(path="/plus")
    public String plus(@RequestParam(value = "num1", required = false) int num1, @RequestParam(value="num2", required = false) int num2){
        return calculatorService.plus(num1,num2);
    }

    @GetMapping(path="/minus")
    public String minus(@RequestParam(value = "num1", required = false) int num1, @RequestParam(value="num2", required = false) int num2){
        return calculatorService.minus(num1,num2);
    }
    @GetMapping(path="/multiply")
    public String multiply(@RequestParam(value = "num1", required = false) int num1, @RequestParam(value="num2", required = false) int num2){
        return calculatorService.multiply(num1,num2);
    }
    @GetMapping(path="/divide")
    public String divide(@RequestParam(value = "num1", required = false) int num1, @RequestParam(value="num2", required = false) int num2){
        return calculatorService.divide(num1,num2);
    }

}
