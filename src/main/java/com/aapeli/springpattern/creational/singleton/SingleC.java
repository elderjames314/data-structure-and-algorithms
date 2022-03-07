package com.aapeli.springpattern.creational.singleton;

/**
 * @author jamesoladimeji
 * @created 28/12/2021 - 6:41 AM
 * @project IntelliJ IDEA
 */
public class SingleC {
    private static SingleC getInstance = null;

    private SingleC() {}

    public static SingleC getInstance() {
        if(getInstance == null) {
            getInstance = new SingleC();

        }
        return getInstance;
    }
}
