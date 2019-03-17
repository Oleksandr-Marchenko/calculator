package com.company;

import com.sun.deploy.util.StringUtils;

public class Calculator {

    public static void main(String[] args){

        while (true) {
            System.out.println("Введите команду через пробел (2 * 2)...");
            String[] params = MyScan.getString().trim().split(" ");
            if (params.length < 1 || params.length > 3) {
                System.out.println("Неверная команда.");
                continue;
            }

            for (String s: params) {
                System.out.println(s);
            }
            String param = null;
            if (params.length > 1) {
                param = params[1].intern();
            }

            double num1 = Double.parseDouble(params[0].replaceAll("\\D+", "."));
            double num2 = Double.parseDouble(params[2].replaceAll("\\D+", "."));

            Operations o;
            switch (param) {
                case "+":
                    o = Operations.ADDITION;
                    System.out.println(o.apply(num1, num2));
                    break;
                case "-":
                    o = Operations.SUBTRACTION;
                    System.out.println(o.apply(num1, num2));
                    break;
                case "*":
                    o = Operations.MULTIPLY;
                    System.out.println(o.apply(num1, num2));
                    break;
                case "/":
                    o = Operations.DIVISION;
                    System.out.println(o.apply(num1, num2));
                    break;
            }
        }
    }
}
