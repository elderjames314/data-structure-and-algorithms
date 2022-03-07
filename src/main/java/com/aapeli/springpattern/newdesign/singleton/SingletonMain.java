package com.aapeli.springpattern.newdesign.singleton;

/**
 * @author jamesoladimeji
 * @created 29/12/2021 - 4:06 PM
 * @project IntelliJ IDEA
 */
public class SingletonMain {
    public static void main(String[] args) {
        Singleton james = Singleton.getInstance();
        Singleton james2 = Singleton.getInstance();

        james.simpleMethod();
        james2.simpleMethod();
    }
}
