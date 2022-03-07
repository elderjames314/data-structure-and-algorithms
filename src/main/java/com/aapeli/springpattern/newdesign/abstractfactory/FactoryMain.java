package com.aapeli.springpattern.newdesign.abstractfactory;

/**
 * @author jamesoladimeji
 * @created 29/12/2021 - 3:39 PM
 * @project IntelliJ IDEA
 */
public class FactoryMain {
    public static void main(String[] args) {
        ProfessionFactory professionFactory = new ProfessionFactory();
        AbstractProfessionFactory profession = AbstractFactoryProducer.getProfession(true);
        profession.getProfession("Doctor").print();
       // Profession profession =  professionFactory.ProfessionFactory("Engineer");
       // profession.print();
    }
}
