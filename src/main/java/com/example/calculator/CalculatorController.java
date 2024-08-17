package com.example.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    private final CalculatorServiceInterface calculatorService;


    public CalculatorController(CalculatorServiceInterface calculatorService) {
        this.calculatorService = calculatorService;
    }


    @GetMapping

    public String calculator() {
        return calculatorService.calculator();
    }

    @GetMapping(path = "/calculator")
    public String answerCalculator() {
        return calculatorService.answerCalculator();
    }

    @GetMapping(path = "/calculator/plus")
    public String CalculatorPlus(@RequestParam(value = "num1", required = false) Integer num1,
                                 @RequestParam(value = "num2", required = false) Integer num2) {
        return calculatorService.CalculatorPlus(num1, num2);
    }

    @GetMapping(path = "/calculator/minus")
    public String CalculatorMinus(@RequestParam(value = "num1", required = false) Integer num1,
                                  @RequestParam(value = "num2", required = false) Integer num2) {
        return calculatorService.CalculatorMinus(num1, num2);
    }

    @GetMapping(path = "/calculator/multiply")
    public String CalculatorMultiply(@RequestParam(value = "num1", required = false) Integer num1,
                                     @RequestParam(value = "num2", required = false) Integer num2) {
        return calculatorService.CalculatorMultiply(num1, num2);
    }

    @GetMapping(path = "/calculator/divide")
    public String CalculatorDivide(@RequestParam(value = "num1", required = false) Integer num1,
                                   @RequestParam(value = "num2", required = false) Integer num2) {
        return calculatorService.CalculatorDivide(num1, num2);
    }

}
