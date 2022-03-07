package com.aapeli.springpattern.newdesign.structuraldesign.flyweight;

/**
 * @author jamesoladimeji
 * @created 29/12/2021 - 5:24 PM
 * @project IntelliJ IDEA
 */
public class Dog implements Animal{
    private String name = null;
    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void printAnimalAttributes() {

        System.out.println("Name of the animal is: "+ this.name);
        System.out.println("Number of eyes of animal: "+ CommonShared.eyes);
        System.out.println("Number of legs of animal: "+ CommonShared.legs);
        System.out.println("Number of nose of animal: "+ CommonShared.nose);
        System.out.println("Number of tail of animal: "+ CommonShared.tail);

    }
}
