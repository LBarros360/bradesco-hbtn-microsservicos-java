package com.example.calculator.controller;

import com.example.calculator.model.Calculator;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@RequestMapping(value="/calculator")
public class CalculatorController {

    private final Calculator calculator = new Calculator();

    @GetMapping("/welcome")
    public String messageWelcome() {
        return "Bem vindo à CALCULATOR API REST.";
    }

    @GetMapping("/addNumbers")
    public Double addNumbers(
            @RequestParam(name = "number1") Double n1,
            @RequestParam(name = "number2") Double n2) {

        Double result = calculator.sum(n1, n2);
        return result;
    }

    @GetMapping("/subNumbers")
    public Double subNumbers(
            @RequestParam(name = "number1") Double n1,
            @RequestParam(name = "number2") Double n2) {

        Double result = calculator.sub(n1, n2);
        return result;
    }

    @GetMapping("/divideNumbers")
    public Double divideNumbers(
            @RequestParam(name = "number1") Double n1,
            @RequestParam(name = "number2") Double n2) {

        Double result = calculator.divide(n1, n2);
        return result;
    }

    @GetMapping("/factorial")
    public Integer factorial(@RequestParam(name = "factorial") Integer factorial) {
        Integer result = calculator.factorial(factorial);
        return result;
    }

    @GetMapping("/calculeDayBetweenDate")
    public int calculeDayBetweenDate(
            @RequestParam("localDate1")
            @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate localDate1,

            @RequestParam("localDate2")
            @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate localDate2) {

        int days = calculator.calculeDayBetweenDate(localDate1, localDate2);
        return days;
    }

    @GetMapping("/integerToBinary")
    public Integer integerToBinary(@RequestParam(name = "number1") Integer n1) {
        Integer binary = calculator.integerToBinary(n1);
        return binary;
    }

    @GetMapping("/integerToHexadecimal")
    public String integerToHexadecimal(@RequestParam(name = "number1") Integer n1) {
        String hex = calculator.integerToHexadecimal(n1);
        return hex;
    }
}
