package com.aapeli.springpattern.newdesign.prototype;

/**
 * @author jamesoladimeji
 * @created 29/12/2021 - 4:21 PM
 * @project IntelliJ IDEA
 */
public class PrototypeMain {
    public static void main(String[] args) {
        ProfessionCache.loadProfession();

        Profession doctor = ProfessionCache.getCloneNewProfession(1);
        doctor.print();

        Profession engineer = ProfessionCache.getCloneNewProfession(2);
        engineer.print();
    }
}
