package pro.sky.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/calculator")
public class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }
    @GetMapping()
    public String welcomeCalculator(){
        return"<h1> Добро пожаловать в калькулятор.</h1>";
    }

    @GetMapping("/plus")
    public String sumNambers(@RequestParam(value = "num1", required = false) Integer num1, @RequestParam(value="num2", required = false) Integer num2){
        return calculatorService.sumNambers(num1,num2);
    }

    @GetMapping("/minus")
    public String subtractNambers(@RequestParam(value = "num1", required = false) Integer num1, @RequestParam(value="num2", required = false) Integer num2){
        return calculatorService.subtractNambers(num1,num2);
    }
    @GetMapping("/multiply")
    public String multiplyNambers(@RequestParam(value = "num1", required = false) Integer num1, @RequestParam(value="num2", required = false) Integer num2){
        return calculatorService.multiplyNambers(num1,num2);
    }
    @GetMapping("/divide")
    public String divideNambers(@RequestParam(value = "num1",required = false) Integer num1, @RequestParam(value= "num2",required = false) Integer num2){
        return calculatorService.divideNambers(num1,num2);}
}

