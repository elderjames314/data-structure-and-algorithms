package com.aapeli.springpattern.newdesign.abstractfactory;

/**
 * @author jamesoladimeji
 * @created 29/12/2021 - 3:56 PM
 * @project IntelliJ IDEA
 */
public class AbstractFactoryProducer {
    public static AbstractProfessionFactory getProfession(boolean isTrainner) {
        if(isTrainner)
            return new TraineeFactory();
        return new ProfessionFactory();
    }
}
