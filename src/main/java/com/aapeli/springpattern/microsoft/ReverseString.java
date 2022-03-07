package com.aapeli.springpattern.microsoft;

/**
 * @author jamesoladimeji
 * @created 08/02/2022 - 5:00 PM
 * @project IntelliJ IDEA
 */
public class ReverseString {
    public static void main(String[] args) {
        String name = "JAmes";
        System.out.println(name);
        System.out.println(reverseString(name));
        System.out.println(reverseString2(name));
    }

    static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    //incase you are not allowed to use buitl in API
    static String reverseString2(String str) {
        StringBuilder sb = new StringBuilder();
        for(int i = str.length()-1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
}
