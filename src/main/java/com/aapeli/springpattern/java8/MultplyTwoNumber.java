package com.aapeli.springpattern.java8;

/**
 * @author jamesoladimeji
 * @created 29/12/2021 - 2:03 PM
 * @project IntelliJ IDEA
 */
public class MultplyTwoNumber {
    public static void main(String[] args) {
        MultipleInterface multipleInterface = (a, b) -> a * b;

        System.out.println(multipleInterface.multiply(3, 2));
    }
}
