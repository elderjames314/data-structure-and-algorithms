package com.aapeli.springpattern.java8;

/**
 * @author jamesoladimeji
 * @created 28/12/2021 - 3:17 PM
 * @project IntelliJ IDEA
 */
public interface IJames {
    void printName();

    default void printAge() {
        System.out.println("Ola");
    }
}
