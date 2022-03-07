package com.aapeli.springpattern.microsoft;

/**
 * @author jamesoladimeji
 * @created 01/02/2022 - 1:53 PM
 * @project IntelliJ IDEA
 */
public class FactorailRecursive {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    static int factorial(int n) {
        if(n==0) return 1;
        else return n * factorial(n - 1);
    }
}
