package com.aapeli.springpattern.newdesign.prototype;

/**
 * @author jamesoladimeji
 * @created 29/12/2021 - 4:11 PM
 * @project IntelliJ IDEA
 */
public abstract class Profession implements Cloneable {
    public int id;
    private String name;

    abstract void print();

    public Object cloningMethod() {
        Object clone = null;
        try {
            clone = super.clone();
        }catch (CloneNotSupportedException ex) {
            ex.printStackTrace();
        }
        return clone;
    }
}
