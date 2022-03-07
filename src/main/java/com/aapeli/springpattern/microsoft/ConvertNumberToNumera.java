package com.aapeli.springpattern.microsoft;

/**
 * @author jamesoladimeji
 * @created 09/02/2022 - 5:24 AM
 * @project IntelliJ IDEA
 */
public class ConvertNumberToNumera {
    public static void main(String[] args) {
        System.out.println(convertNumberToNumeral(14));
    }

    static String convertNumberToNumeral(int numbs) {
        String[] units = {"","I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String[] tens  = {"","X", "XI", "XII", "XII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX"};

        return  tens[(numbs%100) / 10] + units[(numbs%10)];
    }
}
