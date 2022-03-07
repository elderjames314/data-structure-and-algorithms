package com.aapeli.springpattern.newdesign.abstractfactory;

/**
 * @author jamesoladimeji
 * @created 29/12/2021 - 3:37 PM
 * @project IntelliJ IDEA
 */
public class TraineeFactory extends AbstractProfessionFactory {

    @Override
    Profession getProfession(String typeOfProfession) {
        switch (typeOfProfession) {
            case "Doctor":
                return new TraineeDoctor();
            case "Engineer":
                return new TrainneEngineer();
            default:
                return null;

        }
    }
}
