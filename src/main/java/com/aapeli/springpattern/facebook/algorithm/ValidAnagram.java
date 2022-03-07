package com.aapeli.springpattern.facebook.algorithm;

import java.util.Hashtable;
import java.util.Map;

/**
 * @author jamesoladimeji
 * @created 22/01/2022 - 3:41 PM
 * @project IntelliJ IDEA
 */
public class ValidAnagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
    }

    public static boolean isAnagram(String s, String t) {

        if(s.length() != t.length()) return false;

        int[] char_counts = new int[26];

        for (int i = 0; i < s.length(); i++) {
            char_counts[s.charAt(i)-'a']++;
            char_counts[t.charAt(i)-'a']--;
        }

        for(int count: char_counts) {
            if(count != 0) return false;
        }
        return true;


    }
}

