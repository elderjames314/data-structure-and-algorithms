package com.aapeli.springpattern.newdesign.abstractfactory;

/**
 * @author jamesoladimeji
 * @created 29/12/2021 - 3:54 PM
 * @project IntelliJ IDEA
 */
public class TraineerFactory extends AbstractProfessionFactory {
    @Override
    Profession getProfession(String typeOfProfession) {
        switch (typeOfProfession) {
            case "Engineer":
                return new TrainneEngineer();
            case "Doctor":
                return new TraineeDoctor();
            default:
                return null;
        }
    }
}
