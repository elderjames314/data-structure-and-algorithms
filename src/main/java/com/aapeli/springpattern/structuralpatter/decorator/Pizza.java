package com.aapeli.springpattern.structuralpatter.decorator;

import java.math.BigDecimal;

/**
 * @author jamesoladimeji
 * @created 03/12/2021 - 9:15 AM
 * @project IntelliJ IDEA
 */
public abstract class Pizza {

    protected String description;

    public String getDescription() {
        return description;
    }

    public abstract BigDecimal getCost();
}
