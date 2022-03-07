package com.aapeli.springpattern.microsoft;

/**
 * @author jamesoladimeji
 * @created 08/02/2022 - 4:12 PM
 * @project IntelliJ IDEA
 */
public class FIZZBUZZ {

    public static void main(String[] args) {
        fizzBuzz(100);
    }

    static void fizzBuzz(int num) {
        for(int i = 0; i<= num; i++) {
            if(i%3==0 && i%5==0) {
                System.out.println("FizzBuzz");
            }else if(i%3==0) {
                System.out.println("Fizz");
            }else if(i % 5 ==0) {
                System.out.println("Buzz");
            }else
                System.out.println(i);
        }
    }
}
