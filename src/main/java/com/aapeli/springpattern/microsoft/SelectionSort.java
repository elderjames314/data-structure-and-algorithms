package com.aapeli.springpattern.microsoft;

import java.util.Arrays;

/**
 * @author jamesoladimeji
 * @created 31/01/2022 - 5:10 PM
 * @project IntelliJ IDEA
 */
public class SelectionSort {

    public static void main(String[] args) {

        int[] age = {43, 23, 23, 6, 4, 5, 7,3, 6};

        doSelectionSort(age);


    }

    static void doSelectionSort(int[] arr) {
        //this is sorting system where you iterate fine the minumum number
        //when you find it
        //swap it in the current position you are

        for(int i = 0; i < arr.length - 1; i++) {
            int minIndex = i; //we will assument the index we are is the minimum index
            //then search through
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            //swap here when you are done with the searching
            //for performance
            if(i != minIndex) {
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }

        }

        System.out.println(Arrays.toString(arr));
    }

}
