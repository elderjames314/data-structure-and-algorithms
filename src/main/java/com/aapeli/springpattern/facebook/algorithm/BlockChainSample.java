package com.aapeli.springpattern.facebook.algorithm;

import java.util.Arrays;
import java.util.List;

/**
 * @author jamesoladimeji
 * @created 24/02/2022 - 10:59 PM
 * @project IntelliJ IDEA
 */
public class BlockChainSample {
    public static void main(String[] args) {
        String statement = "This is perfect2";

        int hashValue = statement.hashCode();

        //System.out.println(hashValue);

        String[] names = {"james","oladimeji"};
        String[] names2 = {"james","oladimeji"};

        int hash1 = Arrays.hashCode(names);
        int hash2 = Arrays.hashCode(names2);

        System.out.println("hash1 = "+ hash1 + ", hash2 = "+ hash2);
    }
}
