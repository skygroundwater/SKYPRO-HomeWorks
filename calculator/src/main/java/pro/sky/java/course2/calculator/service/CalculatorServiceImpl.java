package pro.sky.java.course2.calculator.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public String showWelcomeToCalculator(){
        return "Welcome to calculator!";
    }
    @Override
    public String plus(@RequestParam String num1, @RequestParam String num2){
            int newNum1 = Integer.parseInt(num1);
            int newNum2 = Integer.parseInt(num2);
        return num1 + " + " + num2 + " = " + (newNum1 + newNum2);
    }
    public String minus(@RequestParam String num1, @RequestParam String num2) {
            int newNum1 = Integer.parseInt(num1);
            int newNum2 = Integer.parseInt(num2);
            return num1 + " + " + num2 + " = " + (newNum1 - newNum2);
    }
    public String multiply(@RequestParam String num1, @RequestParam String num2){
            int newNum1 = Integer.parseInt(num1);
            int newNum2 = Integer.parseInt(num2);
            return num1 + " + " + num2 + " = " + (newNum1 * newNum2);
    }
    public String divide(@RequestParam String num1, @RequestParam String num2){
            int newNum1 = Integer.parseInt(num1);
            int newNum2 = Integer.parseInt(num2);
            if(newNum2 == 0) return "На ноль делить нельзя";
            return num1 + " + " + num2 + " = " + newNum1 / newNum2;
    }
}
