package com.company;

public enum Operations {

    ADDITION("+"){
        double apply (double x, double y){
            return x + y;
        }
    },
    SUBTRACTION("-"){
        double apply (double x, double y){
            return x - y;
        }
    },
    MULTIPLY("*"){
        double apply (double x, double y){
            return x * y;
        }
    },
    DIVISION("/"){
        double apply (double x, double y){
            return x / y;
        }
    };
    private final String symbol;

    Operations(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return "Operations{" +
                "symbol='" + symbol + '\'' +
                '}';
    }

    abstract double apply (double x, double y);
}
