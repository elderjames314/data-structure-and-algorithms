package com.aapeli.springpattern.java8;

import java.util.Objects;

/**
 * @author jamesoladimeji
 * @created 09/01/2022 - 11:23 AM
 * @project IntelliJ IDEA
 */
public class EqualObj {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EqualObj)) return false;
        EqualObj equalObj = (EqualObj) o;
        return id == equalObj.id;
    }

    //@Override
   /* public int hashCode() {
        return Objects.hash(id);
    }*/




    public static void main(String[] args) {
        EqualObj equalObj = new EqualObj();
        equalObj.setId(1);
        equalObj.setName("james");

        EqualObj equalObj2 = new EqualObj();
        equalObj2.setId(1);
        equalObj2.setName("ola");

        System.out.println("shallow compare: "+ (equalObj == equalObj2));
        System.out.println("deep compare: "+ (equalObj.equals(equalObj2)));
       // System.out.println("hascode:"+ equalObj.Hast);


    }
}
