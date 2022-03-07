package com.aapeli.springpattern.facebook1;

/**
 * @author jamesoladimeji
 * @created 16/02/2022 - 10:59 AM
 * @project IntelliJ IDEA
 */
public class Outerclass {
    public int number = 9;

    public void hey() {
        System.out.println("hey there this is outer class");

         class localClass {
            public int localNumber = 9;
            public void whatsUp() {
                System.out.println("this is good");
            }
        }

        localClass localClass = new localClass();
        localClass.whatsUp();
    }

    public static class innerClass {
        public int innerNumber = 9;
        public void hey() {
            System.out.println("this is james from inner class");
        }
    }


    public static void main(String[] args) {
        Outerclass outerclass = new Outerclass();
        outerclass.hey();

        Outerclass.innerClass myInner = new Outerclass.innerClass();
        myInner.hey();
    }
}
