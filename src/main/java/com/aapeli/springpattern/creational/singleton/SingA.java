package com.aapeli.springpattern.creational.singleton;

/**
 * @author jamesoladimeji
 * @created 02/12/2021 - 5:39 PM
 * @project IntelliJ IDEA
 */
public class SingA {
    private static SingA instance;

    private SingA() {
        super();
    }

    public static SingA getInstance() {
        if(null == instance) {
            synchronized (SingA.class){
                if(null == instance) {
                    instance = new SingA();
                }
            }
        }
        return instance;
    }

    public String getName(String name) {
        return name;
    }
}
