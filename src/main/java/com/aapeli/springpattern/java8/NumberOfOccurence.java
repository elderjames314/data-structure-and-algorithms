package com.aapeli.springpattern.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author jamesoladimeji
 * @created 29/12/2021 - 2:15 PM
 * @project IntelliJ IDEA
 */
public class NumberOfOccurence {

    public static void main(String[] args) {
        String str = "welcome to code to decode to code at the same in welcome";

        List<String> collections = Arrays.asList(str.split(" "));

      Map<String, Long> collects = collections.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(collects);


    }
}
