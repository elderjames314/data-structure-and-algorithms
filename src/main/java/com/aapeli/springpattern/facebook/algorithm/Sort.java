package com.aapeli.springpattern.facebook.algorithm;

import java.util.Arrays;

/**
 * @author jamesoladimeji
 * @created 20/01/2022 - 1:26 PM
 * @project IntelliJ IDEA
 */
public class Sort {
    public static void main(String[] args) {
        int[] myarr = {4,3, 2, 6, 7, 1, 3};
        sortItem(myarr);
        System.out.println(Arrays.toString(myarr));
    }


    static void sortItem(int[] arr) {
        //find the lenght of the array
        int length = arr.length;
        //loop therough the item
        for (int i = 0; i < length - 1; i++) {
            //find the min index with minimum value
            //we will assume is index i
            int min_index = i;
            //loop throught the second time, this time start with next neighbiur
            for(int j = i + 1; j < length; j++) {
                //check if this current j value is greater value of the curren min index
                //if yes swap min index and j
                if(arr[min_index] < arr[j])
                    min_index = j;
                //swap min index and current i value
                int temp = arr[min_index];
                arr[min_index] = arr[i];
                arr[i] = temp;
            }

        }

    }
}
