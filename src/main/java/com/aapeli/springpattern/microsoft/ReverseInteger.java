package com.aapeli.springpattern.microsoft;

/**
 * @author jamesoladimeji
 * @created 09/02/2022 - 4:59 AM
 * @project IntelliJ IDEA
 */
public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(reverseInteger(213334));
        System.out.println(reverse2Integer(213334));
    }

    static long reverse2Integer(int nums) {
        StringBuilder sb = new StringBuilder(""+nums);
        return  Long.parseLong(sb.reverse().toString());
    }

    static long reverseInteger(int nums) {
        long reverse = 0;
        while (nums != 0) {
            reverse = reverse * 10 + nums%10;
            nums /= 10;

            if(reverse < Long.MIN_VALUE || reverse > Long.MAX_VALUE)
                return 0;
        }
        return reverse;
    }

}
