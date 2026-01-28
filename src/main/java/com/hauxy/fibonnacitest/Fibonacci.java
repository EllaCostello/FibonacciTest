package com.hauxy.fibonnacitest;

import java.math.BigInteger;

public class Fibonacci {

    // OPGAVE 4: Beregner uden brug af løkker, men rekursiv
    public static int F(int n) {
        if (n < 0) throw new IllegalArgumentException();

        if (n == 0 || n == 1) {
            return n;
        } else {
            return F_help(n, 2);
        }




    }

    private static int F_help(int n, int k) {

    }



}
