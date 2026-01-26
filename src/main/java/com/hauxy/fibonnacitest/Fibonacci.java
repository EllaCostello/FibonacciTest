package com.hauxy.fibonnacitest;

public class Fibonacci {

    // OPGAVE 1: Opfylder testen, men regner ikke korrekt
    /*

    public static int F(int n) {
        if (n >= 2) {
            return n -1;
        }
        if (n < 0) {
            throw new IllegalArgumentException();
        }

        return n;
    }

     */

    // OPGAVE 2: Beregner Fibonacci-tal naivt ud fra definitionen
    /*
    public static int F(int n) {
        if (n > 1) {
            return F(n-1) + F(n-2);
        }

        if (n < 0) {
            throw  new IllegalArgumentException();
        }

        return n;
    }

     */

    // OPGAVE 3: Beregner Fibonacci-tal ved brug af en løkke
    /*
    public static int F(int n) {
        if (n < 0) {
            throw new IllegalArgumentException();
        }
        if (n == 0) return 0;
        if (n == 1) return 1;

        int previous = 0;
        int current = 1;

        for (int i = 2; i <= n; i++) {
            int next = previous + current;
            previous = current;
            current = next;
        }

        return current;
    }
     */

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
