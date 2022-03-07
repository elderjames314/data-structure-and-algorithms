package com.aapeli.springpattern.microsoft;

import java.util.Hashtable;
import java.util.Map;

/**
 * @author jamesoladimeji
 * @created 31/01/2022 - 7:55 PM
 * @project IntelliJ IDEA
 */
public class DuplicateCharacter {
    public static void main(String[] args) {

        System.out.println(hasDuplicateCharacters("greatt"));

    }


    static boolean hasDuplicateCharacters(String a) {
        //you can use hastable to accomplish this
        Hashtable<String, Integer> keeps = new Hashtable<>();
        for(int i = 0; i < a.length(); i++) {
            String key = ""+a.charAt(i);
           // int value = keeps.containsKey(key) ? value++ : 1;
            int value = 1;
            if(keeps.containsKey(key)) {
                value = keeps.get(key);
                value++;
            }
            keeps.put(key, value);
        }
        for(Map.Entry<String, Integer> entry : keeps.entrySet()) {
           if(entry.getValue() >= 2) {
                return true;
            }
        }
        return false;
    }
}
