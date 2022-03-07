package com.aapeli.springpattern.java8;

import org.apache.logging.log4j.util.TriConsumer;
import org.apache.tomcat.util.http.fileupload.util.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.*;
import java.util.stream.IntStream;
import java.util.zip.DataFormatException;

/**
 * @author jamesoladimeji
 * @created 28/12/2021 - 3:17 PM
 * @project IntelliJ IDEA
 */
public class James implements IJames{
    @Override
    public void printAge() {
        System.out.println("hi");
    }

    @Override
    public void printName() {
        System.out.println("my name is James");
    }

    public static void main(String[] args) {
    /*    IJames james = new James();
        james.printName();
        james.printAge();

        Predicate<String> checkLength = s->s.length() > 5;
        System.out.println(checkLength.test("james"));

        Function<Integer, Integer> doubleit = i -> 2 * i;
        Function<Integer, Integer> cubeit = i -> i * i * i;
        System.out.println("square: "+ doubleit.apply(2));
        System.out.println("cube: "+ cubeit.apply(2));

        Consumer<Integer> printAge = integer -> {
            int j = integer * 5;
            System.out.println(j);
        };
        Consumer<Integer> printAge1 = integer -> System.out.println(integer);
        printAge.andThen(printAge1).accept(4);

        System.out.println(doubleit.andThen(cubeit).apply(2));
        System.out.println(doubleit.compose(cubeit).apply(2));

        Supplier<Date> currentDate = () -> new Date();
        System.out.println(currentDate.get());*/

        List<Integer> ages = new ArrayList<>();
        ages.add(2);
        ages.add(45);
        ages.add(23);
        ages.add(4);
        System.out.println(ages.stream().max((i1, i2)-> i1.compareTo(i2)).get());

     // int[] myages = ages.Instream().map(x -> x * 2).toArray();

        // IntStream s = Arrays.stream(ages);


    }
}
