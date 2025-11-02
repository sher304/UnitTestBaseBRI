package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number: ");
        double firstDigit = scanner.nextDouble();
        System.out.println("Please enter second number: ");
        double secondDigit = scanner.nextDouble();
        System.out.println("Please enter symbol [+,*,-,/]: ");
        String symbol = scanner.next();
        Calculator calculator = new Calculator(firstDigit, secondDigit, symbol);
        switch (symbol){
            case "+" -> System.out.println("Addition: " + calculator.addition());
            case "-" -> System.out.println("Subtraction: " + calculator.subtraction());
            case "*" -> System.out.println("Multiplication: " + calculator.multiplication());
            case "/" -> System.out.println("Division: " + calculator.division());
        }
    }
}

