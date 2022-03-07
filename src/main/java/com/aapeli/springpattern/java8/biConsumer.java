package com.aapeli.springpattern.java8;

import java.util.function.BiConsumer;

/**
 * @author jamesoladimeji
 * @created 28/12/2021 - 7:35 AM
 * @project IntelliJ IDEA
 */
public class biConsumer {

    public static void main(String[] args) {
        //biConsumer biConsumer = new biConsumer()
        // System.out.println(biConsumer.add(2, 4));

       // BiConsumer<Integer, Integer> biConsumer = (a, b) -> System.out.println(a + b);

       // biConsumer.accept(4, 5);

        FunctionalInterfaceDemo f =  biConsumer::printName;
        f.singleAbstractMethod("James");


    }

    private static void printName(String s) {
        System.out.println("hello"+ s);
    }

    public static void printName() {
        System.out.println("Hello "+ "james");
    }


    public int add(int a, int b) {
        return a + b;
    }


}


