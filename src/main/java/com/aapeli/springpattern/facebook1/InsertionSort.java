package com.aapeli.springpattern.facebook1;

import java.util.Random;

/**
 * @author jamesoladimeji
 * @created 16/02/2022 - 8:34 AM
 * @project IntelliJ IDEA
 */
public class InsertionSort {

    public static void main(String[] args) {

        Random random = new Random();

        int[] randNum = new int[20];

        for(int i = 0; i < 20; i++) {
            randNum[i] = random.nextInt(100);
        }

        for (int i = 0; i < randNum.length; i++) {
            System.out.println(randNum[i]);
        }

        System.out.println("********************");

        for(int i = 1; i< randNum.length; i++) {
            int current  = randNum[i];

            int j = i - 1;

            while (j >= 0 && randNum[j] > current) {
                randNum[j + 1] = randNum[j];
                j--;
            }
            randNum[j+ 1] = current;
        }

        for (int i = 0; i < randNum.length; i++) {
            System.out.println(randNum[i]);
        }

    }


}
