package com.aapeli.springpattern.newdesign.abstractfactory;

/**
 * @author jamesoladimeji
 * @created 29/12/2021 - 3:37 PM
 * @project IntelliJ IDEA
 */
public class Engineer implements Profession {
    @Override
    public void print() {
        System.out.println("Engineer");
    }
}
