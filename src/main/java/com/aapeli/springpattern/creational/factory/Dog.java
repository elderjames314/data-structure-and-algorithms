package com.aapeli.springpattern.creational.factory;

/**
 * @author jamesoladimeji
 * @created 02/12/2021 - 4:41 PM
 * @project IntelliJ IDEA
 */
public class Dog implements Pet{
    private String name;
    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getType() {
        return null;
    }

    @Override
    public boolean isHungry() {
        return false;
    }

    @Override
    public void feed() {

    }
}
