package com.hauxy.fibonnacitest;

public class Fibonacci {

    // OPGAVE 3: Beregner Fibonacci-tal ved brug af en løkke
    public static int F(int n) {
        if (n < 0) {
            throw new IllegalArgumentException();
        }
        if (n == 0) return 0;
        if (n == 1) return 1;

        int previousNum = 0;
        int currentNum = 1;

        for (int i = 2; i <= n; i++) {
            int next = previousNum + currentNum;
            previousNum = currentNum;
            currentNum = next;
        }

        return currentNum;
    }
}
