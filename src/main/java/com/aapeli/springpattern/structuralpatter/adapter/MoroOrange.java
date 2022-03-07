package com.aapeli.springpattern.structuralpatter.adapter;

/**
 * @author jamesoladimeji
 * @created 03/12/2021 - 9:05 AM
 * @project IntelliJ IDEA
 */
public class MoroOrange implements Orange{
    @Override
    public String getVariety() {
        return "Moro varieties enjoyed";
    }

    @Override
    public void peel() {
        System.out.println("Moro get peeled");
    }

    @Override
    public void eat() {
        System.out.println("Moro get eat and enjoyed");
    }

    @Override
    public void juice() {
        System.out.println("Moro get juiced");
    }


    public static void main(String[] args) {
        Orange orange = new MoroOrange();
        Apple apple = new AppleAdapter(orange);
        System.out.println(apple.getVariety());
        apple.eat();
    }
}
