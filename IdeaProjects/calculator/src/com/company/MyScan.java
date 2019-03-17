package com.company;

import java.util.Scanner;

public class MyScan {

    final static Scanner scanner = new Scanner(System.in);

    public static String getString() {
//        System.out.println("Введите ");
        return scanner.nextLine();
    }
}
