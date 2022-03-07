package com.aapeli.springpattern.microsoft;

import java.util.Arrays;

/**
 * @author jamesoladimeji
 * @created 31/01/2022 - 6:27 PM
 * @project IntelliJ IDEA
 */
public class InsertionSort {
    public static void main(String[] args) {

        int[] arr = {23, 4, 22, 4, 5, 2, 1, 56, 34, 23,2};
        doInsertionSort(arr);

    }



    static void doInsertionSort2(int[] arr) {
        for(int i = 0; i < arr.length-1; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
    }




    static void doInsertionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = current;
        }

        System.out.println(Arrays.toString(arr));
    }
}
