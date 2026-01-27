package com.hauxy.fibonnacitest;

public class Fibonacci {

    // OPGAVE 4: Beregner uden brug af løkker, men rekursiv
    public static int F(int n) {
        if (n < 0) {
            throw new IllegalArgumentException();
        } else if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return F(n - 1) + F(n - 2);
        }
    }

}
