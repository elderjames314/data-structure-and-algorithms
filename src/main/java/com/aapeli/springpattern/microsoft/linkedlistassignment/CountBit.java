package com.aapeli.springpattern.microsoft.linkedlistassignment;

/**
 * @author jamesoladimeji
 * @created 02/02/2022 - 3:56 AM
 * @project IntelliJ IDEA
 */
public class CountBit {
    public static void main(String[] args) {

    }
    public int[] countBits(int n) {

        int[] mem = new int[n+1];
        mem[0] = 0;

        for(int i = 1; i <= n; i++) {
            mem[i] = mem[i/2] + i%2;
        }

        return mem;

    }
}
