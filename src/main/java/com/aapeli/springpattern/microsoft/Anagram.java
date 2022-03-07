package com.aapeli.springpattern.microsoft;

import java.util.Hashtable;

/**
 * @author jamesoladimeji
 * @created 31/01/2022 - 8:12 PM
 * @project IntelliJ IDEA
 */
public class Anagram {
    public static void main(String[] args) {

        System.out.println(isAnagram("madam", "adamm"));

    }

    static boolean isAnagram(String a, String b) {
        String[] arrA = a.split("");
        String[] arrB = b.split("");

        Hashtable<String, Integer> keeA = new Hashtable<>();
        Hashtable<String, Integer> keeB = new Hashtable<>();

        for(int i = 0; i < arrA.length - 1; i++) {;
            int value =1;
            if(keeA.containsKey(arrA[i])) {
                value = keeA.get(arrA[i]);
                value++;
            }
            keeA.put(arrA[i], value);
        }

        for(int i = 0; i < arrB.length - 1; i++) {
            int value =1;
            if(keeB.containsKey(arrB[i])) {
                value = keeB.get(arrB[i]);
                value++;
            }
            keeB.put(arrB[i], value);
        }

        for(int i = 0; i < arrA.length - 1; i++) {
            if(keeA.get(arrA[i]) != keeB.get(arrA[i])) {
                return false;
            }
        }

        return true;

    }
}
