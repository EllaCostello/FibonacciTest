package com.hauxy.fibonnacitest;

public class Fibonacci {

    // OPGAVE 1: Opfylder testen, men regner ikke korrekt


    public static int F(int n) {
        if (n >= 2) {
            return n -1;
        }
        if (n < 0) {
            throw new IllegalArgumentException();
        }

        return n;
    }
}
