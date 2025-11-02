package org.example;

public class Calculator {

    private double A;
    private double B;
    private String symbol;

    public Calculator(double A, double B, String symbol) {
        this.A = A;
        this.B = B;
        this.symbol = symbol;
    }

    public double addition() {
        return A + B;
    }

    public double subtraction() {
        return A - B;
    }

    public double multiplication() {
        return A * B;
    }

    public double division() {
        return A / B;
    }

    @Override
    public String toString() {
        return A + " " + symbol + " " + B;
    }
}
