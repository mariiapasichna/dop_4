package com.mariiapasichna;

public class Mathematics {

    public static double sqrt(int number) {
        double x;
        double squareRoot = (double) number / 2;
        do {
            x = squareRoot;
            squareRoot = (x + (number / x)) / 2;
        } while ((x - squareRoot) != 0);
        System.out.println(squareRoot);
        return squareRoot;
    }
}