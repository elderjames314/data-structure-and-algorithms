package com.aapeli.springpattern.structuralpatter.adapter;

import com.sun.tools.corba.se.idl.constExpr.Or;

/**
 * @author jamesoladimeji
 * @created 03/12/2021 - 9:02 AM
 * @project IntelliJ IDEA
 */
public class AppleAdapter implements Apple{
    private final Orange orange;

    public AppleAdapter(Orange orange) {
        super();
        this.orange = orange;
    }
    @Override
    public String getVariety() {
        return orange.getVariety();
    }

    @Override
    public void eat() {
        orange.peel();
        orange.eat();
    }
}
