package com.aapeli.springpattern.newdesign.abstractfactory;

/**
 * @author jamesoladimeji
 * @created 29/12/2021 - 3:49 PM
 * @project IntelliJ IDEA
 */
public class TraineeDoctor implements Profession{
    @Override
    public void print() {
        System.out.println("Trainner doctor");
    }
}
