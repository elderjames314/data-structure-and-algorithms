package com.aapeli.springpattern.controller;

import com.aapeli.springpattern.creational.builder.Contact;
import com.aapeli.springpattern.creational.builder.ContactBuilder;
import com.aapeli.springpattern.creational.factory.Pet;
import com.aapeli.springpattern.creational.factory.PetFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jamesoladimeji
 * @created 02/12/2021 - 4:48 PM
 * @project IntelliJ IDEA
 */
@RestController
public class FrontController {

    @Autowired
    private PetFactory petFactory;

    @PostMapping("/adoptpet/{type}/{name}")
    public Pet adoptPet(@PathVariable String type, @PathVariable String name) {
        Pet pet = petFactory.createPet(type);
        pet.setName(name);
        pet.feed();
        return pet;
    }

    @GetMapping("contacts")
    public List<Contact> getPresidents() {
        List<Contact> contacts = new ArrayList<>();
        contacts.add(new ContactBuilder().setFirstName("James").setLastName("Oladimeji").contactBuilder());
        return contacts;
    }
}
