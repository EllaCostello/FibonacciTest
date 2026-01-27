package com.hauxy.fibonnacitest;

public class Fibonacci {

    // OPGAVE 2: Beregner Fibonacci-tal naivt ud fra definitionen
    public static int F(int n) {
        if (n > 1) {
            return F(n-1) + F(n-2);
        }

        if (n < 0) {
            throw  new IllegalArgumentException();
        }

        return n;
    }
}
