package com.aapeli.springpattern.structuralpatter.decorator;

import java.math.BigDecimal;

/**
 * @author jamesoladimeji
 * @created 03/12/2021 - 9:21 AM
 * @project IntelliJ IDEA
 */
public class Pepperoni extends PizzaIngredient{
    public Pizza pizza;
    public Pepperoni(Pizza pizza) {
        super();
        this.pizza = pizza;
    }

    @Override
    public BigDecimal getCost() {
        return new BigDecimal(1.50).add(this.pizza.getCost());
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " pepperoni";
    }
}
