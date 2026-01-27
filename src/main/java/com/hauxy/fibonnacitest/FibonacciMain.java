package com.hauxy.fibonnacitest;

import java.util.Scanner;

public class FibonacciMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        System.out.println(F(sc.nextInt()));
    }

    public static int F(int n) {
        if (n > 1) {
            int evenNum = 0;
            int unevenNum = 0;

            while (n / )
            return F(n-1) + F(n-2);
        }

        if (n < 0) {
            throw  new IllegalArgumentException();
        }

        return n;
    }
}
