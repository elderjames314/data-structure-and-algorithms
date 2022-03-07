package com.aapeli.springpattern.structuralpatter.decorator;

/**
 * @author jamesoladimeji
 * @created 03/12/2021 - 9:24 AM
 * @project IntelliJ IDEA
 */
public class TestDecorator {
    public static void main(String[] args) {
        Pizza pizza = new ThickCrustPizza();
        System.out.println(pizza.getDescription());
        System.out.println(pizza.getCost());

      Pepperoni pepperoni = new Pepperoni(pizza);
        System.out.println(pepperoni.getCost());
        System.out.println(pepperoni.getDescription());

    }
}
