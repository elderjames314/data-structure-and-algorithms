package com.aapeli.springpattern.microsoft;

import java.util.Arrays;

/**
 * @author jamesoladimeji
 * @created 31/01/2022 - 3:17 PM
 * @project IntelliJ IDEA
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] ageas = {23, 4, 2, 56, 45, 3, 23, 67, 34};
        myBubbleSort(ageas);
    }

    static void  myBubbleSort(int[] arr) {
        //compare the current with neighbor from right and find out which one is largest
        //then swap them
        for(int i = 0; i < arr.length - 2; i++) {
            for (int j = 0; j < arr.length - 2 - i; j++) {
                int temp;
                if(arr[j] > arr[j + 1]) {
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
