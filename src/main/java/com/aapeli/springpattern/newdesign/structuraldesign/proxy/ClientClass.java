package com.aapeli.springpattern.newdesign.structuraldesign.proxy;

/**
 * @author jamesoladimeji
 * @created 29/12/2021 - 4:47 PM
 * @project IntelliJ IDEA
 */
public class ClientClass {
    public static void main(String[] args) {
        Subject subject = new ProxyClass();
        subject.method();
    }
}
