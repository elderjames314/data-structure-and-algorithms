package com.aapeli.springpattern.newdesign.structuraldesign.proxy;

/**
 * @author jamesoladimeji
 * @created 29/12/2021 - 4:45 PM
 * @project IntelliJ IDEA
 */
public class ProxyClass extends RealSubjectClass {


    public void method() {
        System.out.println(" hi i am proxy, i wll perform authentication and security checks");

        //perform aiuthentication

        System.out.println("calling real method from the real subject implementing class after passed authentication check");
        super.method();
    }

}
