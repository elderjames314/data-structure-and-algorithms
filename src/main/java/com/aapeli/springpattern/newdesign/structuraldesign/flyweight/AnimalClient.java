package com.aapeli.springpattern.newdesign.structuraldesign.flyweight;

/**
 * @author jamesoladimeji
 * @created 29/12/2021 - 5:25 PM
 * @project IntelliJ IDEA
 */
public class AnimalClient {

    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.setName("lucky");
        dog.printAnimalAttributes();
    }
}
