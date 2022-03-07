package com.aapeli.springpattern.newdesign.singleton;

/**
 * @author jamesoladimeji
 * @created 29/12/2021 - 4:03 PM
 * @project IntelliJ IDEA
 */
public class Singleton {
    public static Singleton intance = new Singleton();

    private Singleton() {}

    public static Singleton getInstance() {
        return intance;
    }

    void simpleMethod() {
        System.out.println("hashcode of simple object: "+ intance);
    }
}
