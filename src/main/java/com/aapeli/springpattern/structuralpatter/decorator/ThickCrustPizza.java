package com.aapeli.springpattern.structuralpatter.decorator;

import java.math.BigDecimal;

/**
 * @author jamesoladimeji
 * @created 03/12/2021 - 9:16 AM
 * @project IntelliJ IDEA
 */
public class ThickCrustPizza extends Pizza{
    public ThickCrustPizza() {
        super();
        this.description = "Thick Crust Pizza";
    }

    @Override
    public BigDecimal getCost() {
        return new BigDecimal(15.00);
    }
}
