package com.aapeli.springpattern.creational.factory;

import org.springframework.stereotype.Component;

/**
 * @author jamesoladimeji
 * @created 02/12/2021 - 4:39 PM
 * @project IntelliJ IDEA
 */
@Component
public class PetFactory {
    public Pet createPet(String animalType) {
        switch (animalType) {
            case "dog":
                return new Dog();
            case "cat":
                return new Cat();
            default:
                throw  new UnsupportedOperationException("unknown animal provided");
        }
    }
}
