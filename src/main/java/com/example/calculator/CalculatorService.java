package com.example.calculator;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class CalculatorService implements CalculatorServiceInterface {
    public String calculator() {
        return "Добро пожаловать в калькулятор";
    }

    public String answerCalculator() {
        return "Добро пожаловать в калькулятор";
    }


    public String CalculatorPlus(@RequestParam("num1") Integer num1,
                                 @RequestParam("num2") Integer num2
    ) {
        if (num1 == null || num2 == null) {
            return "Необходимо ввести параметры num1 и num2!";
        } else {
            return num1 + " + " + num2 + " = " + (num1 + num2);
        }
    }

    public String CalculatorMinus(@RequestParam("num1") Integer num1,
                                  @RequestParam("num2") Integer num2
    ) {
        if (num1 == null || num2 == null) {
            return "Необходимо ввести параметры num1 и num2!";
        } else {
            return num1 + " - " + num2 + " = " + (num1 - num2);
        }
    }

    public String CalculatorMultiply(@RequestParam("num1") Integer num1,
                                     @RequestParam("num2") Integer num2
    ) {
        if (num1 == null || num2 == null) {
            return "Необходимо ввести параметры num1 и num2!";
        } else {
            return num1 + " * " + num2 + " = " + (num1 * num2);
        }
    }

    public String CalculatorDivide(@RequestParam("num1") Integer num1,
                                   @RequestParam("num2") Integer num2
    ) {
        if (num1 == null || num2 == null) {
            return "Необходимо ввести параметры num1 и num2!";
        } else {
            if (num2 != 0) {
                return num1 + " / " + num2 + " = " +  ((double)num1/ num2);
            } else {
                return "Ошибка деления на 0!";
            }
        }

    }
}
