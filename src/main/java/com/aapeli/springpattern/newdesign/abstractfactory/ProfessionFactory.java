package com.aapeli.springpattern.newdesign.abstractfactory;

/**
 * @author jamesoladimeji
 * @created 29/12/2021 - 3:37 PM
 * @project IntelliJ IDEA
 */
public class ProfessionFactory extends AbstractProfessionFactory {

    @Override
    Profession getProfession(String typeOfProfession) {
        switch (typeOfProfession) {
            case "Doctor":
                return new Doctor();
            case "Engineer":
                return new Engineer();
            default:
                return null;

        }
    }
}
