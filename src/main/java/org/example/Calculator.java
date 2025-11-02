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

    public double division() throws Exception {
        if (B != 0) return A / B;
        else throw new Exception("Zero division error!");
    }

    public double getA() {
        return A;
    }

    public void setA(double a) {
        A = a;
    }

    public double getB() {
        return B;
    }

    public void setB(double b) {
        B = b;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return A + " " + symbol + " " + B;
    }


}
