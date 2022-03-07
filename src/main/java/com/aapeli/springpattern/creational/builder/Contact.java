package com.aapeli.springpattern.creational.builder;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

/**
 * @author jamesoladimeji
 * @created 02/12/2021 - 5:23 PM
 * @project IntelliJ IDEA
 */
@AllArgsConstructor
@ToString
@Data
public class Contact {
    private String firstName;
    private String lastName;
    private String email;

    public Contact() {super();}
}
