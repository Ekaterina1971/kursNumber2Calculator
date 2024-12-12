package pro.sky.calculator;

import org.springframework.stereotype.Service;

@Service
public final class CalculatorService {
    private int num1;
    private int num2;

    public String sumNambers(Integer num1, Integer num2){
        if(num1 == null || num2 == null ){
            return "<h1>Неверно введен запрос, попробуйте еще раз.</h1>";}
        else {
            return num1 + " + " + num2 + " = " + (num1 + num2);
        }
    }
    public String subtractNambers(Integer num1, Integer num2){
        if(num1 == null || num2 == null ){
            return "<h1>Неверно введен запрос, попробуйте еще раз.</h1>";}
        else {
            return num1 + " - " + num2 + " = " + (num1-num2);
        }
    }
    public String multiplyNambers(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "<h1>Неверно введен запрос, попробуйте еще раз.</h1>";
        } else {
            return num1 + " * " + num2 + " = " + (num1*num2);
        }
    }
    public String divideNambers(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "<h1>Неверно введен запрос, попробуйте еще раз.</h1>";
        } else if(num2==0){ return "<h1> Деление на 0 невозможно.</h1>";
            }else {
                return num1 + " / " + num2 + " = " + (num1 / num2);
        }

    }
}
