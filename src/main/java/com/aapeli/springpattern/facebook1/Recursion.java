package com.aapeli.springpattern.facebook1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jamesoladimeji
 * @created 16/02/2022 - 9:02 AM
 * @project IntelliJ IDEA
 */
public class Recursion {
    public static void main(String[] args) {

        //sayHi(5);

        List<Integer> names = new ArrayList<>();



    }

    static void sayHi(int count) {
        if(count <= 1) return;
        System.out.println("say hi");

        sayHi(count - 1);
    }
}

class MyList<T, V extends Object> {
    T name;
    V age;
}
