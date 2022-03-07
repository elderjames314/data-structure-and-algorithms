package com.aapeli.springpattern.java8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author jamesoladimeji
 * @created 29/12/2021 - 1:54 PM
 * @project IntelliJ IDEA
 */
public class DuplicateElement {

    public static void main(String[] args) {
        List<Integer> ages = new ArrayList<>();
        ages.add(90);
        ages.add(34);
        ages.add(20);
        ages.add(40);
        ages.add(20);
        ages.add(18);
        ages.add(18);
        ages.add(100);

        findDuplicateElement(ages);
    }

    static void findDuplicateElement(List<Integer> elements) {
        Set<Integer> set = new HashSet<>();
        //elements.stream().filter(x -> !set.add(x)).collect(Collectors.toSet()).forEach(System.out::println);
        //limit
        elements.stream().limit(3).forEach(System.out::println);
        System.out.println("*****");
        //skip
        elements.stream().skip(3).forEach(System.out::println);
    }
}
