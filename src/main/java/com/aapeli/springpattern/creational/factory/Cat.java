package com.aapeli.springpattern.creational.factory;

/**
 * @author jamesoladimeji
 * @created 02/12/2021 - 4:44 PM
 * @project IntelliJ IDEA
 */
public class Cat implements Pet{
    private String name;
    private String type;
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
