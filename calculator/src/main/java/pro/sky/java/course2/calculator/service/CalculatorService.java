package pro.sky.java.course2.calculator.service;

import org.springframework.web.bind.annotation.RequestParam;


public interface CalculatorService {
    String showWelcomeToCalculator();
    String plus(@RequestParam String num1, @RequestParam String num2);
    String minus(@RequestParam String num1, @RequestParam String num2);
    String multiply(@RequestParam String num1, @RequestParam String num2);
    String divide(@RequestParam String num1, @RequestParam String num2);
}
