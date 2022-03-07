package com.aapeli.springpattern.java8;

/**
 * @author jamesoladimeji
 * @created 28/12/2021 - 7:51 AM
 * @project IntelliJ IDEA
 */
@FunctionalInterface
public interface FunctionalInterfaceDemo {

    void singleAbstractMethod(String name );

    default void printName() {
        System.out.println("James Oladimeji");
    }

    default void printAge() {
        System.out.println("34");
    }
}
