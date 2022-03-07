package com.aapeli.springpattern.newdesign.factory;

/**
 * @author jamesoladimeji
 * @created 29/12/2021 - 3:37 PM
 * @project IntelliJ IDEA
 */
public class ProfessionFactory {
    public Profession ProfessionFactory(String typOfProfession) {
        switch (typOfProfession) {
            case "Doctor":
                return new Doctor();
            case "Engineer":
                return new Engineer();
            default:
                return null;

        }
    }
}
