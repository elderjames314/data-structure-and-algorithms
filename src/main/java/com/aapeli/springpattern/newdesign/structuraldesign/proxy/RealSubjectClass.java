package com.aapeli.springpattern.newdesign.structuraldesign.proxy;

/**
 * @author jamesoladimeji
 * @created 29/12/2021 - 4:44 PM
 * @project IntelliJ IDEA
 */
public class RealSubjectClass implements Subject{
    @Override
    public void method() {
        System.out.println("I am an actual implementation of subject, rest all the proxies :D");
    }
}
