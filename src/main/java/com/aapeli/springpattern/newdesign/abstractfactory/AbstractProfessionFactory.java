package com.aapeli.springpattern.newdesign.abstractfactory;

/**
 * @author jamesoladimeji
 * @created 29/12/2021 - 3:50 PM
 * @project IntelliJ IDEA
 */
public abstract class AbstractProfessionFactory {
    abstract Profession getProfession(String typeOfProfession);
}
