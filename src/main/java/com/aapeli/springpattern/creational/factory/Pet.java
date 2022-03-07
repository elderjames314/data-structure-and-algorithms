package com.aapeli.springpattern.creational.factory;

/**
 * @author jamesoladimeji
 * @created 02/12/2021 - 4:38 PM
 * @project IntelliJ IDEA
 */
public interface Pet {
    void setName(String name);
    String getName();
    String getType();
    boolean isHungry();
    void feed();
}
